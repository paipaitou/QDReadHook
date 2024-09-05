// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.androidApplication).apply(false)
    alias(libs.plugins.androidLibrary).apply(false)
    alias(libs.plugins.compose.compiler).apply(false)
    alias(libs.plugins.dokka).apply(false)
    alias(libs.plugins.jgit).apply(false)
    alias(libs.plugins.kotlinAndroid).apply(false)
    alias(libs.plugins.kotlinSerialization).apply(false)
    alias(libs.plugins.ktorfit).apply(false)
    alias(libs.plugins.ksp).apply(false)
}