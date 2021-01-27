package com.neocyber.neocyber.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/version1/register_user")
@AllArgsConstructor
public class RegistrationController {
    private final RegistrationService registrationService;

    @PostMapping
    public String register(@RequestBody RegistrationRequest registrationRequest)
    {
        return registrationService.register(registrationRequest);
    }

    @GetMapping(path = "/confirm")
    public String confirm(@RequestParam("token") String token)
    {
        return registrationService.confirmToken(token);
    }
}
