package org.linkedgeodesy.rdf4jext.config;

import java.io.IOException;
import org.json.simple.JSONObject;

/**
 * Class for POM details
 * @author thiery
 */
public class POM_rdf4jext {
    
    /**
     * get POM info as JSON
     * @return pom JSON
     * @throws IOException 
     */
    public static JSONObject getInfo() throws IOException {
        JSONObject outObj = new JSONObject();
        JSONObject maven = new JSONObject();
        maven.put("modelVersion", RDF4JExtProperties.getPropertyParam("modelVersion"));
        maven.put("mavenCompilerSource", RDF4JExtProperties.getPropertyParam("source"));
        maven.put("mavenCompilerTarget", RDF4JExtProperties.getPropertyParam("target"));
        outObj.put("maven", maven);
        JSONObject project = new JSONObject();
        project.put("buildNumber", RDF4JExtProperties.getPropertyParam("buildNumber"));
        project.put("buildNumberShort", RDF4JExtProperties.getPropertyParam("buildNumber").substring(0, 7));
        project.put("buildRepository", RDF4JExtProperties.getPropertyParam("url").replace(".git", "/tree/" + RDF4JExtProperties.getPropertyParam("buildNumber")));
        project.put("artifactId", RDF4JExtProperties.getPropertyParam("artifactId"));
        project.put("groupId", RDF4JExtProperties.getPropertyParam("groupId"));
        project.put("version", RDF4JExtProperties.getPropertyParam("version"));
        project.put("packaging", RDF4JExtProperties.getPropertyParam("packaging"));
        project.put("name", RDF4JExtProperties.getPropertyParam("name"));
        project.put("description", RDF4JExtProperties.getPropertyParam("description"));
        project.put("url", RDF4JExtProperties.getPropertyParam("url"));
        project.put("encoding", RDF4JExtProperties.getPropertyParam("sourceEncoding"));
        outObj.put("project", project);
        return outObj;
    }

}
