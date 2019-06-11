package br.com.sample.bankaccount.web.rest;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-06-11T01:35:03.801Z")

public class ApiException extends RuntimeException {
    private int code;

    public ApiException(int code, String msg) {
        super(msg);
        this.code = code;
    }
}
