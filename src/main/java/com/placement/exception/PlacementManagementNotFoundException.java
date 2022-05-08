package com.placement.exception;

public class PlacementManagementNotFoundException extends RuntimeException 
{
	private static final long serialVersionUID=1L;
	public PlacementManagementNotFoundException()
	{
		super();
	}
	public PlacementManagementNotFoundException(String customMessage) {
        super(customMessage);
	}

}