package mx.com.nok.core.quartz;


import org.quartz.Job; 
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException; 


public class HolaMundoJob implements Job{

	public void execute(JobExecutionContext jobExecutionContext) 
	throws JobExecutionException {
	System.out.println("¡Hola, mundo! :D");
	}

	}
