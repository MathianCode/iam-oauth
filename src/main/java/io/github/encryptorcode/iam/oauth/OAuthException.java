package io.github.encryptorcode.iam.oauth;

public class OAuthException extends Exception {

    public OAuthException(String message) {
        super(message);
    }

    public OAuthException(String message, Throwable cause) {
        super(message, cause);
    }
}
