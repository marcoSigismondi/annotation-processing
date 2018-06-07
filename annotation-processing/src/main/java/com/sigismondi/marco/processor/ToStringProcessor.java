package com.sigismondi.marco.processor;

import java.util.Set;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.annotation.processing.SupportedSourceVersion;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import javax.tools.Diagnostic.Kind;

import com.sigismondi.marco.annotation.ToString;

@SupportedAnnotationTypes("com.sigismondi.marco.annotation.ToString")
@SupportedSourceVersion(javax.lang.model.SourceVersion.RELEASE_6)
public class ToStringProcessor extends AbstractProcessor {

	@Override
	public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
		for (Element elem : roundEnv.getElementsAnnotatedWith(ToString.class)) {
			ToString complexity = elem.getAnnotation(ToString.class);
	        String message = "annotation found in " + elem.getSimpleName() + " with style " + complexity.style();
	        processingEnv.getMessager().printMessage(Kind.NOTE, message);
	    }
	    return true;

	}

}
