package com.zouqi.wx.message.response;


/**
 * 音乐消息
 * 
 * @author caozf
 * @date 2013-05-19
 */
public class MusicMessage extends BaseMessage {
	// 音乐
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}