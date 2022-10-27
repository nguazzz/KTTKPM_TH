package com.example.springbootresttemplate.service;

import com.example.springbootresttemplate.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class LoginServiceImpl implements LoginService {
    private RestTemplate restTemplate;
    private String crmUrl;

    @Autowired
    public LoginServiceImpl(RestTemplate theRestTemplate, @Value("${crm.url.subject}") String theCrmUrl) {
        restTemplate = theRestTemplate;
        crmUrl = theCrmUrl;
    }

	@Override
	public void addUser(User user) {
		int id = user.getId();
        if (id == 0) {
            restTemplate.postForEntity(crmUrl, user, String.class);
        } else {
            restTemplate.put(crmUrl, user);
        }
		
	}

	@Override
	public List<User> getUsers() {
		ResponseEntity<List<User>> responseEntity = restTemplate.exchange(crmUrl, HttpMethod.GET, null,
                new ParameterizedTypeReference<List<User>>() {});
        List<User> sbs =  responseEntity.getBody();
        return sbs;
	}
}
