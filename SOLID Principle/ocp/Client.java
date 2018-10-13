package com.mukit.ocp;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		FileCompressorSwitcher switcher = new FileCompressorSwitcher();
		switcher.setCompressor(new RarFileCompressor());
		switcher.archive(new ArrayList<>());
		
		switcher.setCompressor(new ZipFileCompressor());
		switcher.archive(new ArrayList<>());
		
		// Now new compressor type comes 7ZipCompressor, we don't 
		// need to change any compressor code. Just add the 
		// compressor class and make it implemented to FileCompressor.
		// So no need to modify tested code. Just create new class
		// and few change of main method
		
		switcher.setCompressor(new SevenZipFileCompressor());
		switcher.archive(new ArrayList<>());
	}
}
