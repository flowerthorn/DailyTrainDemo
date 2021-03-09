package com.study.java.annotation;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.Messager;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic;

/**
 * 注解处理器
 */
@SupportedAnnotationTypes("com.study.java.annotation.TestAnnotation")
public class TestProcessor extends AbstractProcessor {

    @Override
    public boolean process(Set<? extends TypeElement> set, RoundEnvironment roundEnvironment) {
        final Messager messager = processingEnv.getMessager();
        messager.printMessage(Diagnostic.Kind.WARNING,"---------TestProcessor process");
        messager.printMessage(Diagnostic.Kind.WARNING,"-----TestProcessor process2");

        return false;
    }

    @Override
    public SourceVersion getSupportedSourceVersion() {
        return super.getSupportedSourceVersion();
    }
}
