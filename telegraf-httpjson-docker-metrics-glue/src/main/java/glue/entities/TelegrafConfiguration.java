package glue.entities;


public class TelegrafConfiguration {

    private DockerConfiguration dockerConfiguration;
    private String inputHttpJsonName;
    
	public DockerConfiguration getDockerConfiguration() {
		return dockerConfiguration;
	}
	public void setDockerConfiguration(DockerConfiguration dockerConfiguration) {
		this.dockerConfiguration = dockerConfiguration;
	}
	public String getInputHttpJsonName() {
		return inputHttpJsonName;
	}
	public void setInputHttpJsonName(String inputHttpJsonName) {
		this.inputHttpJsonName = inputHttpJsonName;
	}
    
    
    
}
