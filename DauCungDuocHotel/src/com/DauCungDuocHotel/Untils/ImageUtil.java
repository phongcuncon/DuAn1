package com.DauCungDuocHotel.Untils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.ImageIcon;

public class ImageUtil {
	
public static void save(File src) {
        File dst = new File(ImageUtil.class.getResource("/image").getPath(),src.getName());
        if(!dst.getParentFile().exists()) {
            dst.getParentFile().mkdir();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
	
	public static ImageIcon read(String url) {
		File path = new File(url);
		return new ImageIcon(path.getAbsolutePath());
	}
	
	public static ImageIcon read(URL url) {
		return new ImageIcon(url);
	}
	
	public static ImageIcon read(String url,int w,int h) {
		
		return new ImageIcon(
				new ImageIcon(url)
				.getImage()
				.getScaledInstance(w, h, Image.SCALE_SMOOTH));
	}
	
	public static ImageIcon read(URL url,int w,int h) {
		return new ImageIcon(
				new ImageIcon(url)
				.getImage()
				.getScaledInstance(w, h, Image.SCALE_SMOOTH));
	}

	public static ImageIcon read(ImageIcon icon,int w,int h) {
		return new ImageIcon(
						icon
						.getImage()
						.getScaledInstance(w, h, Image.SCALE_SMOOTH));
	}
}
