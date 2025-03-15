package com.trading.platform.request;

import com.trading.platform.domain.VerificationType;

import lombok.Data;

@Data
public class UpdatePasswordRequest {
	
    private String sendTo;
    private VerificationType verificationType;
	public String getSendTo() {
		return sendTo;
	}
	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}
	public VerificationType getVerificationType() {
		return verificationType;
	}
	public void setVerificationType(VerificationType verificationType) {
		this.verificationType = verificationType;
	}
    
    
}
