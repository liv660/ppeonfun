package ppeonfun.service.admin.quartz;

public interface QuartzService {
	/**
	 * 오늘 시작할 프로젝트
	 */
	public void startProject();
	
	/**
	 * 오늘 마감되는 프로젝트
	 */
	public void endProject();
}
