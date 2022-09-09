package org.example;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class MethOverridingSuper {

    public int count()
    {
        System.out.println("Count Method In SuperClass");
        return 0;
    }

    public void capital()
    {
        System.out.println("Superclass method");
    }
}

