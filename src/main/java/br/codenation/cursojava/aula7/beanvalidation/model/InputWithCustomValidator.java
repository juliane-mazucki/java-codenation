package br.codenation.cursojava.aula7.beanvalidation.model;

import br.codenation.cursojava.aula7.beanvalidation.validator.IpAddress;

public class InputWithCustomValidator {
    @IpAddress
    private String ipAddress;

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
