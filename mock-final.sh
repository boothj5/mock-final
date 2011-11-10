#!/bin/sh

ant clean compile
java -cp bin:lib/javassist.jar com.boothj5.mockfinal.RemoveFinal
ant dirty_test
