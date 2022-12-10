package com.zibro.presentation.util

import timber.log.Timber

/**
 * Logging 시 호출하는 CodeLine,호출하는 함수명 Tag에 추가하는 클래스
 */
class CustomTimberTree : Timber.DebugTree() {
    override fun createStackElementTag(element: StackTraceElement): String {
        return "${element.className}:${element.lineNumber}#${element.methodName}"
    }
}