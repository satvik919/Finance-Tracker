package com.financetracker.userservice.controller;

import com.financetracker.userservice.model.User;
import com.financetracker.userservice.model.UserDTO;
import com.financetracker.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody UserDTO userDTO) {
        User newUser = userService.registerUser(userDTO);
        return ResponseEntity.ok(newUser);
    }

//    @GetMapping("/profile")
//    public ResponseEntity<?> getUserProfile() {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        User user = userService.getUserByUsername(userDetails.getUsername());
//        return ResponseEntity.ok(user);
//    }

//    @PutMapping("/profile")
//    public ResponseEntity<?> updateUserProfile(@RequestBody UserDTO userDTO) {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        userService.updateUserProfile(userDetails.getUsername(), userDTO);
//        return ResponseEntity.ok("Profile updated successfully");
//    }
//
//    @PutMapping("/password")
//    public ResponseEntity<?> changePassword(@RequestBody ChangePasswordRequest changePasswordRequest) {
//        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        userService.changePassword(userDetails.getUsername(), changePasswordRequest.getCurrentPassword(), changePasswordRequest.getNewPassword());
//        return ResponseEntity.ok("Password changed successfully");
//    }
//
//    @PostMapping("/password/reset")
//    public ResponseEntity<?> forgotPassword(@RequestBody ForgotPasswordRequest forgotPasswordRequest) {
//        userService.forgotPassword(forgotPasswordRequest.getEmail());
//        return ResponseEntity.ok("Password reset instructions sent to your email");
//    }
//
//    @GetMapping("/email/verify")
//    public ResponseEntity<?> verifyEmail(@RequestParam("token") String token) {
//        userService.verifyEmail(token);
//        return ResponseEntity.ok("Email verified successfully");
//    }
//
//    @PostMapping("/email/resend")
//    public ResponseEntity<?> resendVerificationEmail(@RequestBody ResendVerificationEmailRequest resendVerificationEmailRequest) {
//        userService.resendVerificationEmail(resendVerificationEmailRequest.getEmail());
//        return ResponseEntity.ok("Verification email resent successfully");
//    }
}

