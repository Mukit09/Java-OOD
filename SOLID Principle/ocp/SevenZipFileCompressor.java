package com.mukit.ocp;

import java.io.File;
import java.util.List;

public class SevenZipFileCompressor implements FileCompressor{

	@Override
	public void compress(List<File> files) {

		System.out.println("Compressing with SevenZip Algo!");
	}
}
