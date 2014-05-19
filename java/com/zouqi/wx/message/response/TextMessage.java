package com.zouqi.wx.message.response;

/**
 * 文本消息
 * 
 * @author caozf
 * @date 2013-05-19
 */
public class TextMessage {
	// 接收方帐号（收到的OpenID）
	private String ToUserName;
	// 开发者微信号
	private String FromUserName;
	// 消息创建时间 （整型）
	private long CreateTime;
	// 消息类型（text/music/news）
	private String MsgType;
	// 位0x0001被标志时，星标刚收到的消息
	private int FuncFlag;
	// 回复的消息内容
	private String Content;

	public String getToUserName() {
		return ToUserName;
	}

	public void setToUserName(String toUserName) {
		ToUserName = toUserName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public long getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(long createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public int getFuncFlag() {
		return FuncFlag;
	}

	public void setFuncFlag(int funcFlag) {
		FuncFlag = funcFlag;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	@Override
	public String toString() {
		return "<xml>\r<ToUserName><![CDATA[ " + ToUserName
				+ "]]></ToUserName>\r<FromUserName><![CDATA[" + FromUserName
				+ "]]></FromUserName>\r<CreateTime>" + CreateTime
				+ "</CreateTime>\r<MsgType><![CDATA[" + MsgType
				+ "]]></MsgType>\r<Content><![CDATA[" + Content
				+ "]]></Content>\r</xml>";
	}

}
