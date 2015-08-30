package com.lyw.zhbj.utils;

import android.graphics.Bitmap;
import android.os.Handler;

public class ImageUtils {
	private NetCache netCache;
	private MemoryCache mMemoryCache;

	public ImageUtils(Handler handler) {
		// 定义内存缓存对象
		mMemoryCache = new MemoryCache();
		//定义网络缓存对象.
		netCache = new NetCache(handler,mMemoryCache);
	}

	/**
	 * 根据url获取图片
	 * @param url
	 * @param tag
	 * @return
	 */
	public Bitmap getImageFromUrl(String url, int tag) {
		Bitmap bm = null;
		// 1. 去内存中取, 取到了之后直接返回.
		bm = mMemoryCache.getBitmap(url);
		if(bm != null) {
			System.out.println("从内存中取");
			return bm;
		}
		// 2. 去本地中取, 取到了之后直接返回.
		bm = LocalCache.getBitmap(url);
		if(bm != null) {
			System.out.println("从本地中取");
			return bm;
		}
		// 3. 去网络中取, 开启子线程异步抓取, 不能直接返回. 当抓取完毕后, 得到图片, 使用handler发送消息发给调用者.
		//不直接返回是因为
		System.out.println("从网络中取:"+tag);
		netCache.getBitmapFromNet(url, tag);
		
		return null;
	}
}
