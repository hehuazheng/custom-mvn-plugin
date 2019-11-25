package com.hezz;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import java.io.File;

/**
 * @author: hezz
 */
@Mojo(name = "mycompiler")
public class MyCompilerMojo extends AbstractMojo {
    @Parameter(property = "mycommand", defaultValue = "ifconfig")
    private String command;

    @Parameter(property = "project", readonly = true)
    private MavenProject project;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("hello, are you ok");
        File base = project.getBasedir();
        getLog().info(base.getAbsolutePath());
        getLog().info(command);
    }
}
