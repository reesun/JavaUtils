package test;

import org.koa.pic.Base64PicHandler;

public class TestBase64Pic {
	public static void main(String[] args) {
		String strImg = Base64PicHandler.GetImageStr("a.jpg");
		Base64PicHandler.GenerateImage(strImg);
	}
}
