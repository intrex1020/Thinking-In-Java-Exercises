package Exceptions;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Logging
{
	private static Logger logger = Logger.getLogger("Logging exception");

	public Logging(Exception e)
	{
		StringWriter trace = new StringWriter();
		e.printStackTrace(new PrintWriter(trace));
		Logging.logger.severe(trace.toString());
	}
}
