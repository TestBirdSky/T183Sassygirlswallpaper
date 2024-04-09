package com.real.estate.attic

import com.real.estate.R
import com.real.estate.bedroom.AtticHelperNotica

/**
 * Date：2024/4/2
 * Describe:
 */
class AtticNotification : MyBaseAttic() {
    override fun getHelper(): AtticHelperNotica {
        return AtticHelperNotica(R.drawable.ic_sig_nosg, R.layout.attic_layout)
    }
}