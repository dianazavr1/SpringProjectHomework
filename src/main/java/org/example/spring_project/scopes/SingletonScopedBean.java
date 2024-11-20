package org.example.spring_project.scopes;

public class SingletonScopedBean {
    private final String id = "Singleton Bean";

    public String getId(){
        return id;
    }
}
