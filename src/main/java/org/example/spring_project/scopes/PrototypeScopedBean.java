package org.example.spring_project.scopes;

public class PrototypeScopedBean {
    private final String id = "Prototype Bean";


    public String getId(){
        return id;
    }
}
