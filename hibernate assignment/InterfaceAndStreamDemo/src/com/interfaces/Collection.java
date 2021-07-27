package com.interfaces;

public interface Collection  {

	default public Stream stream() 
	{
		return Streamsupport.stream();
	}

}
