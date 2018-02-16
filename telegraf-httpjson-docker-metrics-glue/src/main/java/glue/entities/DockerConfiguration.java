package glue.entities;

 
import java.util.List;

public class DockerConfiguration {
    private String dockerHost;
    private String dockerTlsVerify;
    private String dockerCertPath;
    private String dockerConfigPath;
    private List<String> dockerContainersNameFilter;
    private String applicationDefaultNetworkName;
	public String getDockerHost() {
		return dockerHost;
	}
	public void setDockerHost(String dockerHost) {
		this.dockerHost = dockerHost;
	}
	public String getDockerTlsVerify() {
		return dockerTlsVerify;
	}
	public void setDockerTlsVerify(String dockerTlsVerify) {
		this.dockerTlsVerify = dockerTlsVerify;
	}
	public String getDockerCertPath() {
		return dockerCertPath;
	}
	public void setDockerCertPath(String dockerCertPath) {
		this.dockerCertPath = dockerCertPath;
	}
	public String getDockerConfigPath() {
		return dockerConfigPath;
	}
	public void setDockerConfigPath(String dockerConfigPath) {
		this.dockerConfigPath = dockerConfigPath;
	}
	public List<String> getDockerContainersNameFilter() {
		return dockerContainersNameFilter;
	}
	public void setDockerContainersNameFilter(List<String> dockerContainersNameFilter) {
		this.dockerContainersNameFilter = dockerContainersNameFilter;
	}
	public String getApplicationDefaultNetworkName() {
		return applicationDefaultNetworkName;
	}
	public void setApplicationDefaultNetworkName(String applicationDefaultNetworkName) {
		this.applicationDefaultNetworkName = applicationDefaultNetworkName;
	}
    
    
}
