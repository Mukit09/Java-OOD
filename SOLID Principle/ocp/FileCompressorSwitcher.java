package com.mukit.ocp;

import java.io.File;
import java.util.List;

public class FileCompressorSwitcher {

	private FileCompressor compressor;

	public void setCompressor(FileCompressor compressor) {
		this.compressor = compressor;
	}

	public void archive(List<File> files) {
		
		if(compressor == null)
			throw new RuntimeException("No compressor has been set yet");
		
		compressor.compress(files);
	}
	
}
