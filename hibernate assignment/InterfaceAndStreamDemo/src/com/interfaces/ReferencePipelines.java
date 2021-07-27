package com.interfaces;

 abstract class ReferencePipelines implements Stream {

	static class head extends ReferencePipelines{
		head(){
			System.out.println("reference pipelines");
		}
	}
}
