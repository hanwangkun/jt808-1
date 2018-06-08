package com.zhtkj.jt808.vo;

import io.netty.channel.Channel;

public class PackageData {

	protected MsgHeader msgHeader;

	protected MsgBody msgBody;

	protected Channel channel;

	public MsgHeader getMsgHeader() {
		return msgHeader;
	}

	public void setMsgHeader(MsgHeader msgHeader) {
		this.msgHeader = msgHeader;
	}

	public MsgBody getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(MsgBody msgBody) {
		this.msgBody = msgBody;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public static class MsgHeader {

	    protected int msgId;
	    
	    protected int msgBodyLength;
	    
	    protected int encryptType;
	    
	    protected boolean hasSubPack;
	    
	    protected String terminalPhone;

		public int getMsgId() {
			return msgId;
		}

		public void setMsgId(int msgId) {
			this.msgId = msgId;
		}

		public int getMsgBodyLength() {
			return msgBodyLength;
		}

		public void setMsgBodyLength(int msgBodyLength) {
			this.msgBodyLength = msgBodyLength;
		}

		public int getEncryptType() {
			return encryptType;
		}

		public void setEncryptType(int encryptType) {
			this.encryptType = encryptType;
		}

		public boolean isHasSubPack() {
			return hasSubPack;
		}

		public void setHasSubPack(boolean hasSubPack) {
			this.hasSubPack = hasSubPack;
		}

		
		public String getTerminalPhone() {
			return terminalPhone;
		}

		
		public void setTerminalPhone(String terminalPhone) {
			this.terminalPhone = terminalPhone;
		}

	}

	public static class MsgBody {

		private int msgType;
		
		private int serialId;
		
		private int result;
		
		private byte[] msgBodyBytes;
		
		public int getType() {
			return msgType;
		}

		public void setType(int type) {
			this.msgType = type;
		}

		public int getSerialId() {
			return serialId;
		}

		public void setSerialId(int serialId) {
			this.serialId = serialId;
		}

		public int getResult() {
			return result;
		}

		public void setResult(int result) {
			this.result = result;
		}

		
		public byte[] getMsgBodyBytes() {
			return msgBodyBytes;
		}

		
		public void setMsgBodyBytes(byte[] msgBodyBytes) {
			this.msgBodyBytes = msgBodyBytes;
		}
		
	}
	
}