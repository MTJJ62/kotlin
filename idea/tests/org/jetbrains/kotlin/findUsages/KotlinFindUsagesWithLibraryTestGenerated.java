/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.findUsages;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("idea/testData/findUsages/libraryUsages")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KotlinFindUsagesWithLibraryTestGenerated extends AbstractKotlinFindUsagesWithLibraryTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInLibraryUsages() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/findUsages/libraryUsages"), Pattern.compile("^(.+)\\.0\\.kt$"), null, true);
    }

    @TestMetadata("idea/testData/findUsages/libraryUsages/javaLibrary")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class JavaLibrary extends AbstractKotlinFindUsagesWithLibraryTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInJavaLibrary() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/findUsages/libraryUsages/javaLibrary"), Pattern.compile("^(.+)\\.0\\.kt$"), null, true);
        }

        @TestMetadata("LibraryClassUsages.0.kt")
        public void testLibraryClassUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/javaLibrary/LibraryClassUsages.0.kt");
        }

        @TestMetadata("LibraryConstructorUsages.0.kt")
        public void testLibraryConstructorUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/javaLibrary/LibraryConstructorUsages.0.kt");
        }

        @TestMetadata("LibraryFieldUsages.0.kt")
        public void testLibraryFieldUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/javaLibrary/LibraryFieldUsages.0.kt");
        }

        @TestMetadata("LibraryMethodUsages.0.kt")
        public void testLibraryMethodUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/javaLibrary/LibraryMethodUsages.0.kt");
        }

        @TestMetadata("LibraryStaticFieldUsages.0.kt")
        public void testLibraryStaticFieldUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/javaLibrary/LibraryStaticFieldUsages.0.kt");
        }

        @TestMetadata("LibraryStaticMethodUsages.0.kt")
        public void testLibraryStaticMethodUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/javaLibrary/LibraryStaticMethodUsages.0.kt");
        }
    }

    @TestMetadata("idea/testData/findUsages/libraryUsages/kotlinLibrary")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class KotlinLibrary extends AbstractKotlinFindUsagesWithLibraryTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentInKotlinLibrary() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/findUsages/libraryUsages/kotlinLibrary"), Pattern.compile("^(.+)\\.0\\.kt$"), null, true);
        }

        @TestMetadata("LibraryClassUsages.0.kt")
        public void testLibraryClassUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryClassUsages.0.kt");
        }

        @TestMetadata("LibraryCompanionObjectUsages.0.kt")
        public void testLibraryCompanionObjectUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryCompanionObjectUsages.0.kt");
        }

        @TestMetadata("LibraryEnumEntryUsages.0.kt")
        public void testLibraryEnumEntryUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryEnumEntryUsages.0.kt");
        }

        @TestMetadata("LibraryFunctionUsages.0.kt")
        public void testLibraryFunctionUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryFunctionUsages.0.kt");
        }

        @TestMetadata("LibraryMemberFunctionUsages.0.kt")
        public void testLibraryMemberFunctionUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryMemberFunctionUsages.0.kt");
        }

        @TestMetadata("LibraryNestedClassMemberFunctionUsages.0.kt")
        public void testLibraryNestedClassMemberFunctionUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryNestedClassMemberFunctionUsages.0.kt");
        }

        @TestMetadata("LibraryNestedClassPrimaryConstructorUsages.0.kt")
        public void testLibraryNestedClassPrimaryConstructorUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryNestedClassPrimaryConstructorUsages.0.kt");
        }

        @TestMetadata("LibraryNestedClassSecondaryConstructorUsages.0.kt")
        public void testLibraryNestedClassSecondaryConstructorUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryNestedClassSecondaryConstructorUsages.0.kt");
        }

        @TestMetadata("LibraryNestedClassUsages.0.kt")
        public void testLibraryNestedClassUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryNestedClassUsages.0.kt");
        }

        @TestMetadata("LibraryObjectUsages.0.kt")
        public void testLibraryObjectUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryObjectUsages.0.kt");
        }

        @TestMetadata("LibraryPrimaryConstructorUsages.0.kt")
        public void testLibraryPrimaryConstructorUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibraryPrimaryConstructorUsages.0.kt");
        }

        @TestMetadata("LibrarySecondaryConstructorUsages.0.kt")
        public void testLibrarySecondaryConstructorUsages() throws Exception {
            runTest("idea/testData/findUsages/libraryUsages/kotlinLibrary/LibrarySecondaryConstructorUsages.0.kt");
        }
    }

    @TestMetadata("idea/testData/findUsages/libraryUsages/_library")
    @TestDataPath("$PROJECT_ROOT")
    @RunWith(JUnit3RunnerWithInners.class)
    public static class _library extends AbstractKotlinFindUsagesWithLibraryTest {
        private void runTest(String testDataFilePath) throws Exception {
            KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
        }

        public void testAllFilesPresentIn_library() throws Exception {
            KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/findUsages/libraryUsages/_library"), Pattern.compile("^(.+)\\.0\\.kt$"), null, true);
        }

        @TestMetadata("idea/testData/findUsages/libraryUsages/_library/library")
        @TestDataPath("$PROJECT_ROOT")
        @RunWith(JUnit3RunnerWithInners.class)
        public static class Library extends AbstractKotlinFindUsagesWithLibraryTest {
            private void runTest(String testDataFilePath) throws Exception {
                KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
            }

            public void testAllFilesPresentInLibrary() throws Exception {
                KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("idea/testData/findUsages/libraryUsages/_library/library"), Pattern.compile("^(.+)\\.0\\.kt$"), null, true);
            }
        }
    }
}
