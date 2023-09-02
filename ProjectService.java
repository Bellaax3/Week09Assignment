package projects.service;

import projects.dao.ProjectDao;
import projects.entity.Project;

public class ProjectService {
	private ProjectDao projectDao = new ProjectDao();
	
	
/**
 * 
 * @param projects The {@link Project} object.
 * @return 
 */
	public Project addProject(Project project) {
		return projectDao.insertProject(project);
	}

}
