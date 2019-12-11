/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.kapt.cli.test;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("plugins/kapt3/kapt3-cli/testData/integration")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class KaptToolIntegrationTestGenerated extends AbstractKaptToolIntegrationTest {
    private void runTest(String testDataFilePath) throws Exception {
        KotlinTestUtils.runTest(this::doTest, this, testDataFilePath);
    }

    public void testAllFilesPresentInIntegration() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("plugins/kapt3/kapt3-cli/testData/integration"), Pattern.compile("^([^\\.]+)$"), null, false);
    }

    @TestMetadata("argfile")
    public void testArgfile() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/argfile/");
    }

    @TestMetadata("correctErrorTypesOff")
    public void testCorrectErrorTypesOff() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/correctErrorTypesOff/");
    }

    @TestMetadata("correctErrorTypesOn")
    public void testCorrectErrorTypesOn() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/correctErrorTypesOn/");
    }

    @TestMetadata("kotlinFileGeneration")
    public void testKotlinFileGeneration() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/kotlinFileGeneration/");
    }

    @TestMetadata("kotlinFileGenerationDefaultOutput")
    public void testKotlinFileGenerationDefaultOutput() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/kotlinFileGenerationDefaultOutput/");
    }

    @TestMetadata("kt33800")
    public void testKt33800() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/kt33800/");
    }

    @TestMetadata("separateStubAptCompilation")
    public void testSeparateStubAptCompilation() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/separateStubAptCompilation/");
    }

    @TestMetadata("simple")
    public void testSimple() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/simple/");
    }

    @TestMetadata("withoutService")
    public void testWithoutService() throws Exception {
        runTest("plugins/kapt3/kapt3-cli/testData/integration/withoutService/");
    }
}
