package com.real.estate

import android.content.Context
import android.database.Cursor
import android.database.MatrixCursor
import android.net.Uri

/**
 * Date：2024/4/3
 * Describe:
 */
class IsjgkKFloor(var delStas: Int, var update: Int) {
    private val listS = arrayListOf("0".toInt(), "1".toInt(), "2".toInt(), "1".toInt())

    init {
        update = listS[0]
        delStas = listS[0]
    }


    fun sjugiMjsngsk(uri: Uri?, context: Context?): Cursor? {
        if (uri == null || !uri.toString().endsWith("/directories")) {
            return null
        }

        fun getPkgN(): String {
            return context?.packageName ?: ""
        }

        val matrixCursor = MatrixCursor(
            arrayOf(
                "accountName",
                "accountType",
                "displayName",
                "typeResourceId",
                "exportSupport",
                "shortcutSupport",
                "photoSupport"
            )
        )
        matrixCursor.addRow(
            arrayOf<Any>(
                getPkgN(), getPkgN(), getPkgN(), listS[0], listS[3], 1, 1
            )
        )
        return matrixCursor
    }
}