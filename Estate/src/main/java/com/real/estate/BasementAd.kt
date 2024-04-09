//Already processed
package com.real.estate

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.os.Build
import com.adjust.sdk.Adjust
import com.adjust.sdk.AdjustAdRevenue
import com.adjust.sdk.AdjustConfig
import com.anythink.core.api.ATAdInfo
import com.anythink.core.api.ATSDK
import com.anythink.core.api.AdError
import com.anythink.interstitial.api.ATInterstitial
import com.anythink.nativead.api.ATNative
import com.real.estate.bedroom.BasementHImpl
import com.real.estate.bedroom.BasementPerson
import com.real.estate.windows.WindowsHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import kotlinx.coroutines.withContext

// init code
fun exilarchate(def_var_Int_2063: Int): Int {
    var def_var_Long_2064: Long = def_var_Int_2063.toLong()
    var def_var_Long_2065: Long = System.currentTimeMillis()
    var def_var_Long_2066: Long = System.currentTimeMillis()
    var def_var_Long_2067: Long = System.currentTimeMillis()
    var def_var_Long_2068: Long = System.currentTimeMillis()
    var def_var_Long_2069: Long = System.currentTimeMillis()
    var def_var_Long_2070: Long = System.currentTimeMillis()
    var def_var_Long_2071: Long = System.currentTimeMillis()
    var def_var_Long_2072: Long = System.currentTimeMillis()
    def_var_Long_2071 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2071 > def_var_Long_2065) {
            def_var_Long_2071 = def_var_Long_2068 or def_var_Long_2065
        } else if (def_var_Long_2071 == def_var_Long_2065) {
            def_var_Long_2071 = def_var_Long_2072 % def_var_Long_2066
        } else if (def_var_Long_2071 > def_var_Long_2065) {
            def_var_Long_2071 = def_var_Long_2066 + def_var_Long_2070
        } else if (def_var_Long_2071 < def_var_Long_2065) {
            def_var_Long_2071 = def_var_Long_2067 xor def_var_Long_2068
        } else if (def_var_Long_2071 >= def_var_Long_2064) {
            def_var_Long_2071 = def_var_Long_2069 % def_var_Long_2065
        } else if (647.toLong() != def_var_Long_2069) {
            def_var_Long_2071 = 743 / 11
        } else if (def_var_Long_2071 >= def_var_Long_2069) {
            def_var_Long_2071 = def_var_Long_2065 - def_var_Long_2072
        } else if (654.toLong() == def_var_Long_2065) {
            def_var_Long_2071 = 939 or 7
        } else if (def_var_Long_2071 == def_var_Long_2070) {
            def_var_Long_2071 = def_var_Long_2070 + def_var_Long_2069
        } else if (def_var_Long_2071 != def_var_Long_2067) {
            def_var_Long_2071 = def_var_Long_2065 + def_var_Long_2066
        } else if (def_var_Long_2070 <= def_var_Long_2065) {
            def_var_Long_2071 = def_var_Long_2064 + 27
        } else if (690.toLong() == def_var_Long_2072) {
            def_var_Long_2071 = 451 % 22
        } else if (def_var_Long_2064 > def_var_Long_2065) {
            def_var_Long_2071 = def_var_Long_2069 % 29
        } else if (583.toLong() > def_var_Long_2066) {
            def_var_Long_2071 = 569 / 17
        } else if (def_var_Long_2071 > def_var_Long_2069) {
            def_var_Long_2071 = def_var_Long_2071 xor def_var_Long_2068
        } else {
            def_var_Long_2071 = 576.toLong() xor def_var_Long_2069
        }
    }
    return def_var_Long_2071.toInt()
}

fun killing(def_var_Int_2073: Int): Int {
    var def_var_Long_2074: Long = def_var_Int_2073.toLong()
    var def_var_Long_2075: Long = System.currentTimeMillis()
    var def_var_Long_2076: Long = System.currentTimeMillis()
    var def_var_Long_2077: Long = System.currentTimeMillis()
    var def_var_Long_2078: Long = System.currentTimeMillis()
    var def_var_Long_2079: Long = System.currentTimeMillis()
    var def_var_Long_2080: Long = System.currentTimeMillis()
    def_var_Long_2077 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2077 <= def_var_Long_2075) {
            def_var_Long_2077 = def_var_Long_2076 + def_var_Long_2074
        } else if (def_var_Long_2075 <= def_var_Long_2074) {
            def_var_Long_2077 = def_var_Long_2077 or 13
        } else if (def_var_Long_2077 != def_var_Long_2078) {
            def_var_Long_2077 = def_var_Long_2076 and def_var_Long_2078
        } else if (def_var_Long_2077 != def_var_Long_2080) {
            def_var_Long_2077 = def_var_Long_2080 - def_var_Long_2078
        } else if (252.toLong() <= def_var_Long_2074) {
            def_var_Long_2077 = 514 * 13
        } else if (def_var_Long_2077 <= def_var_Long_2079) {
            def_var_Long_2077 = def_var_Long_2079 / def_var_Long_2080
        } else if (716.toLong() == def_var_Long_2074) {
            def_var_Long_2077 = 172 or 7
        } else if (def_var_Long_2077 == def_var_Long_2076) {
            def_var_Long_2077 = def_var_Long_2079 * def_var_Long_2076
        } else if (def_var_Long_2079 >= def_var_Long_2075) {
            def_var_Long_2077 = def_var_Long_2075 and 13
        } else if (def_var_Long_2079 != def_var_Long_2075) {
            def_var_Long_2077 = def_var_Long_2078 % 30
        } else if (def_var_Long_2077 >= def_var_Long_2080) {
            def_var_Long_2077 = def_var_Long_2080 + def_var_Long_2074
        } else if (def_var_Long_2077 <= def_var_Long_2074) {
            def_var_Long_2077 = def_var_Long_2079 * def_var_Long_2077
        } else if (451.toLong() == def_var_Long_2080) {
            def_var_Long_2077 = 838 % 9
        } else if (def_var_Long_2077 <= def_var_Long_2080) {
            def_var_Long_2077 = def_var_Long_2078 - def_var_Long_2079
        } else if (121.toLong() <= def_var_Long_2075) {
            def_var_Long_2077 = 488 * 23
        } else if (def_var_Long_2078 >= def_var_Long_2076) {
            def_var_Long_2077 = def_var_Long_2074 * 11
        } else if (def_var_Long_2077 == def_var_Long_2076) {
            def_var_Long_2077 = def_var_Long_2076 or def_var_Long_2075
        } else if (def_var_Long_2074 < def_var_Long_2078) {
            def_var_Long_2077 = def_var_Long_2074 + 23
        } else if (def_var_Long_2077 > def_var_Long_2074) {
            def_var_Long_2077 = def_var_Long_2079 - def_var_Long_2074
        } else {
            def_var_Long_2077 = 705.toLong() and def_var_Long_2074
        }
    }
    return def_var_Long_2077.toInt()
}

fun otherdom(def_var_Int_2081: Int): Int {
    var def_var_String_2082: String = "bluer"
    var def_var_String_2083: String = "beccaficoes"
    var def_var_String_2084: String = "benzal"
    var def_var_String_2085: String = "ferv"
    var def_var_String_2086: String = "acinotubular"
    def_var_String_2085 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2085.startsWith(def_var_String_2086)) {
            def_var_String_2085 = def_var_String_2085.substringBefore(def_var_String_2082)
        } else if (def_var_String_2085.startsWith(def_var_String_2084)) {
            def_var_String_2085 = def_var_String_2082.commonPrefixWith(def_var_String_2085)
        } else if (def_var_String_2085.equals(def_var_String_2086)) {
            def_var_String_2085 = def_var_String_2085.removePrefix(def_var_String_2086)
        } else if (def_var_String_2084.startsWith(def_var_String_2086)) {
            def_var_String_2085 = def_var_String_2082.removeSuffix("xerafin")
        } else if (def_var_String_2085.endsWith(def_var_String_2083)) {
            def_var_String_2085 = def_var_String_2085.removeSurrounding(def_var_String_2086)
        } else if (def_var_String_2083.startsWith(def_var_String_2084)) {
            def_var_String_2085 = "untreasurable".removeSurrounding("stoury")
        } else if (def_var_String_2085.endsWith(def_var_String_2084)) {
            def_var_String_2085 = def_var_String_2082.removeSuffix(def_var_String_2085)
        } else if (def_var_String_2082.startsWith(def_var_String_2083)) {
            def_var_String_2085 = "unpesterous".removePrefix("suberose")
        } else if (def_var_String_2082.startsWith(def_var_String_2085)) {
            def_var_String_2085 = def_var_String_2086.removePrefix("cartist")
        } else if (def_var_String_2082.equals(def_var_String_2084)) {
            def_var_String_2085 = def_var_String_2083.commonPrefixWith("explications")
        } else if (def_var_String_2082.equals(def_var_String_2084)) {
            def_var_String_2085 = def_var_String_2086.substringBefore("rekindling")
        } else if (def_var_String_2084.equals(def_var_String_2083)) {
            def_var_String_2085 = "munited".removePrefix("gunl")
        } else if (def_var_String_2086.endsWith(def_var_String_2083)) {
            def_var_String_2085 = "sigillarist".removeSurrounding("seguidilla")
        } else if (def_var_String_2085.contains(def_var_String_2082)) {
            def_var_String_2085 = def_var_String_2083.removeSurrounding(def_var_String_2086)
        } else if (def_var_String_2086.startsWith(def_var_String_2086)) {
            def_var_String_2085 = "theanthropism".removeSurrounding("senachie")
        } else {
            def_var_String_2085 = "razzmatazz".substringBefore(def_var_String_2083)
        }
    }
//$ def_var_String_2085

    if (def_var_String_2085.contains("porchless")) {
        return def_var_Int_2081
    }
    return -1
}

fun kashers(def_var_Int_2087: Int): Int {
    var def_var_Int_2088: Int = def_var_Int_2087 / 31
    var def_var_Int_2089: Int = 4
    var def_var_Int_2090: Int = 16
    var def_var_Int_2091: Int = 30
    var def_var_Int_2092: Int = 15
    var def_var_Int_2093: Int = 20
    var def_var_Int_2094: Int = 15
    var def_var_Int_2095: Int = 13
    var def_var_Int_2096: Int = 9
    var def_var_Int_2097: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2097 = def_var_Int_2089 and 21
        def_var_Int_2097 = def_var_Int_2095 or def_var_Int_2091
        def_var_Int_2097 = def_var_Int_2089 or def_var_Int_2094
        def_var_Int_2097 = 5 and 31
        def_var_Int_2097 = def_var_Int_2096 % def_var_Int_2095
        def_var_Int_2097 = 738 or 8
        def_var_Int_2097 = def_var_Int_2095 + def_var_Int_2089
        def_var_Int_2097 = def_var_Int_2093 xor 12
        def_var_Int_2097 = def_var_Int_2092 % 3
        def_var_Int_2097 = def_var_Int_2094 + 5
        def_var_Int_2097 = def_var_Int_2096 / def_var_Int_2089
        def_var_Int_2097 = def_var_Int_2096 * def_var_Int_2092
        def_var_Int_2097 = 438 xor 24
        def_var_Int_2097 = 801 xor 6
        def_var_Int_2097 = 591 and 9
        def_var_Int_2097 = 975 - 13
    }
    return def_var_Int_2097
}

fun semiacademically(def_var_Int_2098: Int): Int {
    var def_var_Int_2099: Int = def_var_Int_2098 or 5
    var def_var_Int_2100: Int = 26
    var def_var_Int_2101: Int = 28
    var def_var_Int_2102: Int = 15
    var def_var_Int_2103: Int = 15
    var def_var_Int_2104: Int = 8
    var def_var_Int_2105: Int = 26
    var def_var_Int_2106: Int = 23
    var def_var_Int_2107: Int = 14
    var def_var_Int_2108: Int = 15
    var def_var_Int_2109: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2109 = def_var_Int_2101 + 13
        def_var_Int_2109 = def_var_Int_2106 + def_var_Int_2103
        def_var_Int_2109 = def_var_Int_2104 and 24
        def_var_Int_2109 = 506 * 22
        def_var_Int_2109 = def_var_Int_2102 xor def_var_Int_2108
        def_var_Int_2109 = def_var_Int_2100 / def_var_Int_2108
        def_var_Int_2109 = def_var_Int_2104 * 11
        def_var_Int_2109 = 105 + 15
        def_var_Int_2109 = 499 - 31
        def_var_Int_2109 = 65 xor 1
        def_var_Int_2109 = 276 - 21
        def_var_Int_2109 = 683 or 30
        def_var_Int_2109 = 211 - 5
        def_var_Int_2109 = def_var_Int_2108 % def_var_Int_2099
        def_var_Int_2109 = def_var_Int_2103 * 16
    }
    return def_var_Int_2109
}

fun tearlike(def_var_Int_2110: Int): Int {
    var def_var_String_2111: String = "agdistis"
    var def_var_String_2112: String = "putridity"
    var def_var_String_2113: String = "turniplike"
    var def_var_String_2114: String = "prospering"
    var def_var_String_2115: String = "ramulous"
    var def_var_String_2116: String = "asiphonogama"
    def_var_String_2112 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2112.equals(def_var_String_2113)) {
            def_var_String_2112 = def_var_String_2113.removePrefix(def_var_String_2111)
        } else if (def_var_String_2112.contains(def_var_String_2114)) {
            def_var_String_2112 = def_var_String_2112.substringBefore(def_var_String_2113)
        } else if (def_var_String_2112.equals(def_var_String_2115)) {
            def_var_String_2112 = def_var_String_2115.commonSuffixWith(def_var_String_2116)
        } else if (def_var_String_2115.equals(def_var_String_2114)) {
            def_var_String_2112 = def_var_String_2114.substringBefore("wagnerist")
        } else if (def_var_String_2116.contains(def_var_String_2116)) {
            def_var_String_2112 = "scenographer".removeSurrounding("pure")
        } else if (def_var_String_2112.startsWith(def_var_String_2116)) {
            def_var_String_2112 = def_var_String_2113.removePrefix(def_var_String_2111)
        } else if (def_var_String_2111.startsWith(def_var_String_2115)) {
            def_var_String_2112 = "untoggler".removeSurrounding("straitlacing")
        } else if (def_var_String_2115.endsWith(def_var_String_2114)) {
            def_var_String_2112 = "twofoldly".substringBefore("saccharobutyric")
        } else if (def_var_String_2112.endsWith(def_var_String_2114)) {
            def_var_String_2112 = def_var_String_2116.substringBefore(def_var_String_2112)
        } else if (def_var_String_2114.equals(def_var_String_2115)) {
            def_var_String_2112 = "appendicularian".substringBeforeLast("betides")
        } else if (def_var_String_2115.contains(def_var_String_2113)) {
            def_var_String_2112 = def_var_String_2116.commonSuffixWith("bee")
        } else if (def_var_String_2114.contains(def_var_String_2114)) {
            def_var_String_2112 = "immoralise".commonSuffixWith("silvics")
        } else if (def_var_String_2113.contains(def_var_String_2111)) {
            def_var_String_2112 = "seeable".substringAfter("gambone")
        } else if (def_var_String_2113.startsWith(def_var_String_2112)) {
            def_var_String_2112 = def_var_String_2115.removePrefix("politicks")
        } else if (def_var_String_2115.endsWith(def_var_String_2113)) {
            def_var_String_2112 = def_var_String_2113.removeSuffix("elderling")
        } else if (def_var_String_2112.contains(def_var_String_2116)) {
            def_var_String_2112 = def_var_String_2114.substringAfter(def_var_String_2111)
        } else if (def_var_String_2116.startsWith(def_var_String_2111)) {
            def_var_String_2112 = def_var_String_2116.substringAfterLast("sandwiching")
        } else {
            def_var_String_2112 = "ocreate".substringBefore(def_var_String_2115)
        }
    }
//$ def_var_String_2112

    if (def_var_String_2112.contains("yocco")) {
        return def_var_Int_2110
    }
    return -1
}

fun cheka(def_var_Int_2117: Int): Int {
    var def_var_Int_2118: Int = def_var_Int_2117 / 16
    var def_var_Int_2119: Int = 29
    var def_var_Int_2120: Int = 5
    var def_var_Int_2121: Int = 2
    var def_var_Int_2122: Int = 2
    var def_var_Int_2123: Int = 27
    var def_var_Int_2124: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2124 = def_var_Int_2123 / 15
        def_var_Int_2124 = 418 - 24
        def_var_Int_2124 = def_var_Int_2118 - def_var_Int_2123
        def_var_Int_2124 = def_var_Int_2119 + def_var_Int_2121
        def_var_Int_2124 = def_var_Int_2123 + def_var_Int_2118
        def_var_Int_2124 = def_var_Int_2121 * def_var_Int_2119
        def_var_Int_2124 = def_var_Int_2119 / def_var_Int_2121
        def_var_Int_2124 = def_var_Int_2121 + 2
        def_var_Int_2124 = def_var_Int_2118 + 26
        def_var_Int_2124 = def_var_Int_2120 - 9
        def_var_Int_2124 = def_var_Int_2119 or def_var_Int_2122
        def_var_Int_2124 = 575 or 16
        def_var_Int_2124 = def_var_Int_2119 or 12
        def_var_Int_2124 = def_var_Int_2121 xor 26
        def_var_Int_2124 = 77 and 16
        def_var_Int_2124 = 20 / 3
    }
    return def_var_Int_2124
}

fun harlequins(def_var_Int_2125: Int): Int {
    var def_var_Long_2126: Long = def_var_Int_2125.toLong()
    var def_var_Long_2127: Long = System.currentTimeMillis()
    var def_var_Long_2128: Long = System.currentTimeMillis()
    var def_var_Long_2129: Long = System.currentTimeMillis()
    var def_var_Long_2130: Long = System.currentTimeMillis()
    var def_var_Long_2131: Long = System.currentTimeMillis()
    var def_var_Long_2132: Long = System.currentTimeMillis()
    var def_var_Long_2133: Long = System.currentTimeMillis()
    def_var_Long_2131 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2131 < def_var_Long_2129) {
            def_var_Long_2131 = def_var_Long_2130 + def_var_Long_2127
        } else if (935.toLong() != def_var_Long_2127) {
            def_var_Long_2131 = 4 - 24
        } else if (def_var_Long_2131 >= def_var_Long_2128) {
            def_var_Long_2131 = def_var_Long_2131 / def_var_Long_2129
        } else if (1006.toLong() > def_var_Long_2128) {
            def_var_Long_2131 = 136 - 8
        } else if (990.toLong() >= def_var_Long_2132) {
            def_var_Long_2131 = 260 - 3
        } else if (def_var_Long_2131 < def_var_Long_2126) {
            def_var_Long_2131 = def_var_Long_2127 * def_var_Long_2132
        } else if (def_var_Long_2131 >= def_var_Long_2127) {
            def_var_Long_2131 = def_var_Long_2129 and def_var_Long_2133
        } else if (def_var_Long_2127 != def_var_Long_2129) {
            def_var_Long_2131 = def_var_Long_2131 or 8
        } else if (98.toLong() == def_var_Long_2128) {
            def_var_Long_2131 = 827 % 12
        } else if (def_var_Long_2131 != def_var_Long_2127) {
            def_var_Long_2131 = def_var_Long_2132 / 24
        } else if (def_var_Long_2131 == def_var_Long_2126) {
            def_var_Long_2131 = def_var_Long_2133 % def_var_Long_2127
        } else if (def_var_Long_2131 >= def_var_Long_2128) {
            def_var_Long_2131 = def_var_Long_2133 * def_var_Long_2127
        } else if (def_var_Long_2130 >= def_var_Long_2133) {
            def_var_Long_2131 = def_var_Long_2132 + 17
        } else if (def_var_Long_2131 < def_var_Long_2132) {
            def_var_Long_2131 = def_var_Long_2128 and def_var_Long_2130
        } else {
            def_var_Long_2131 = 710.toLong() + def_var_Long_2126
        }
    }
    return def_var_Long_2131.toInt()
}

fun venetian(def_var_Int_2134: Int): Int {
    var def_var_String_2135: String = "undulation"
    var def_var_String_2136: String = "lowdowns"
    var def_var_String_2137: String = "taggy"
    var def_var_String_2138: String = "pends"
    var def_var_String_2139: String = "homecomings"
    var def_var_String_2140: String = "elephantiac"
    var def_var_String_2141: String = "documents"
    def_var_String_2138 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2138.endsWith(def_var_String_2135)) {
            def_var_String_2138 = def_var_String_2139.substringAfter(def_var_String_2135)
        } else if (def_var_String_2138.contains(def_var_String_2140)) {
            def_var_String_2138 = def_var_String_2135.commonSuffixWith(def_var_String_2138)
        } else if (def_var_String_2141.startsWith(def_var_String_2139)) {
            def_var_String_2138 = "cheilotomy".removePrefix("stepdaughters")
        } else if (def_var_String_2140.endsWith(def_var_String_2141)) {
            def_var_String_2138 = "unchristian".substringAfter("nurtureless")
        } else if (def_var_String_2135.startsWith(def_var_String_2140)) {
            def_var_String_2138 = "disproval".commonPrefixWith("spirituelle")
        } else if (def_var_String_2136.endsWith(def_var_String_2135)) {
            def_var_String_2138 = def_var_String_2140.substringAfter("scandalizing")
        } else if (def_var_String_2138.equals(def_var_String_2137)) {
            def_var_String_2138 = def_var_String_2140.removeSuffix(def_var_String_2138)
        } else if (def_var_String_2139.startsWith(def_var_String_2135)) {
            def_var_String_2138 = "pyramidaire".commonPrefixWith("stonewalled")
        } else if (def_var_String_2138.contains(def_var_String_2141)) {
            def_var_String_2138 = def_var_String_2139.substringAfter(def_var_String_2138)
        } else if (def_var_String_2140.contains(def_var_String_2141)) {
            def_var_String_2138 = def_var_String_2135.substringBefore("hydroxylactone")
        } else if (def_var_String_2137.startsWith(def_var_String_2137)) {
            def_var_String_2138 = "oribis".substringBeforeLast("chickweeds")
        } else if (def_var_String_2137.contains(def_var_String_2139)) {
            def_var_String_2138 = def_var_String_2139.removeSuffix("resigner")
        } else {
            def_var_String_2138 = "kirning".commonPrefixWith(def_var_String_2137)
        }
    }
//$ def_var_String_2138

    if (def_var_String_2138.endsWith("antisensitizing")) {
        return def_var_Int_2134
    }
    return -1
}

fun merrily(def_var_Int_2142: Int): Int {
    var def_var_Int_2143: Int = def_var_Int_2142 / 5
    var def_var_Int_2144: Int = 29
    var def_var_Int_2145: Int = 10
    var def_var_Int_2146: Int = 16
    var def_var_Int_2147: Int = 21
    var def_var_Int_2148: Int = 4
    var def_var_Int_2149: Int = 5
    var def_var_Int_2150: Int = 15
    var def_var_Int_2151: Int = 12
    var def_var_Int_2152: Int = 7
    var def_var_Int_2153: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2153 = 58 and 19
        def_var_Int_2153 = def_var_Int_2150 / def_var_Int_2145
        def_var_Int_2153 = def_var_Int_2152 / 25
        def_var_Int_2153 = 134 / 5
        def_var_Int_2153 = 74 * 17
        def_var_Int_2153 = def_var_Int_2145 - def_var_Int_2144
        def_var_Int_2153 = def_var_Int_2150 or def_var_Int_2148
        def_var_Int_2153 = def_var_Int_2146 xor 9
        def_var_Int_2153 = 307 / 18
        def_var_Int_2153 = def_var_Int_2148 % def_var_Int_2151
        def_var_Int_2153 = def_var_Int_2145 and 8
        def_var_Int_2153 = def_var_Int_2150 * def_var_Int_2151
        def_var_Int_2153 = def_var_Int_2151 + def_var_Int_2152
    }
    return def_var_Int_2153
}

fun titrants(def_var_Int_2154: Int): Int {
    var def_var_Int_2155: Int = def_var_Int_2154 xor 31
    var def_var_Int_2156: Int = 9
    var def_var_Int_2157: Int = 8
    var def_var_Int_2158: Int = 11
    var def_var_Int_2159: Int = 25
    var def_var_Int_2160: Int = 4
    var def_var_Int_2161: Int = 21
    var def_var_Int_2162: Int = 20
    var def_var_Int_2163: Int = 12
    var def_var_Int_2164: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2164 = def_var_Int_2158 and 30
        def_var_Int_2164 = def_var_Int_2155 / def_var_Int_2157
        def_var_Int_2164 = 331 and 31
        def_var_Int_2164 = def_var_Int_2160 + def_var_Int_2158
        def_var_Int_2164 = def_var_Int_2156 + def_var_Int_2157
        def_var_Int_2164 = def_var_Int_2163 + 16
        def_var_Int_2164 = def_var_Int_2158 / def_var_Int_2160
        def_var_Int_2164 = def_var_Int_2157 / 15
        def_var_Int_2164 = def_var_Int_2155 % def_var_Int_2161
        def_var_Int_2164 = def_var_Int_2163 xor def_var_Int_2162
        def_var_Int_2164 = def_var_Int_2159 + 16
        def_var_Int_2164 = 412 and 29
        def_var_Int_2164 = 638 - 7
        def_var_Int_2164 = 911 - 26
        def_var_Int_2164 = def_var_Int_2155 - 13
        def_var_Int_2164 = 441 - 7
        def_var_Int_2164 = def_var_Int_2155 xor def_var_Int_2163
        def_var_Int_2164 = def_var_Int_2159 and def_var_Int_2163
        def_var_Int_2164 = def_var_Int_2155 + 5
    }
    return def_var_Int_2164
}

fun unpatted(def_var_Int_2165: Int): Int {
    var def_var_Int_2166: Int = def_var_Int_2165 + 4
    var def_var_Int_2167: Int = 16
    var def_var_Int_2168: Int = 17
    var def_var_Int_2169: Int = 30
    var def_var_Int_2170: Int = 19
    var def_var_Int_2171: Int = 12
    var def_var_Int_2172: Int = 25
    var def_var_Int_2173: Int = 8
    var def_var_Int_2174: Int = 29
    var def_var_Int_2175: Int = 25
    var def_var_Int_2176: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2176 = def_var_Int_2170 - 21
        def_var_Int_2176 = def_var_Int_2173 / def_var_Int_2172
        def_var_Int_2176 = 115 - 30
        def_var_Int_2176 = def_var_Int_2173 + 9
        def_var_Int_2176 = 327 - 10
        def_var_Int_2176 = 222 and 17
        def_var_Int_2176 = 851 / 28
        def_var_Int_2176 = def_var_Int_2172 + 5
        def_var_Int_2176 = 344 - 4
        def_var_Int_2176 = def_var_Int_2175 and def_var_Int_2171
    }
    return def_var_Int_2176
}

fun prefeast(def_var_Int_2177: Int): Int {
    var def_var_Long_2178: Long = def_var_Int_2177.toLong()
    var def_var_Long_2179: Long = System.currentTimeMillis()
    var def_var_Long_2180: Long = System.currentTimeMillis()
    var def_var_Long_2181: Long = System.currentTimeMillis()
    var def_var_Long_2182: Long = System.currentTimeMillis()
    var def_var_Long_2183: Long = System.currentTimeMillis()
    var def_var_Long_2184: Long = System.currentTimeMillis()
    def_var_Long_2179 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2179 < def_var_Long_2180) {
            def_var_Long_2179 = def_var_Long_2180 * def_var_Long_2178
        } else if (109.toLong() <= def_var_Long_2181) {
            def_var_Long_2179 = 171 / 2
        } else if (def_var_Long_2179 <= def_var_Long_2180) {
            def_var_Long_2179 = def_var_Long_2184 / def_var_Long_2182
        } else if (def_var_Long_2179 <= def_var_Long_2183) {
            def_var_Long_2179 = def_var_Long_2178 or def_var_Long_2181
        } else if (733.toLong() > def_var_Long_2184) {
            def_var_Long_2179 = 723 - 27
        } else if (361.toLong() <= def_var_Long_2183) {
            def_var_Long_2179 = 181 xor 24
        } else if (def_var_Long_2179 == def_var_Long_2178) {
            def_var_Long_2179 = def_var_Long_2183 + def_var_Long_2179
        } else if (def_var_Long_2182 < def_var_Long_2179) {
            def_var_Long_2179 = def_var_Long_2183 xor 1
        } else if (911.toLong() == def_var_Long_2178) {
            def_var_Long_2179 = 395 and 13
        } else if (def_var_Long_2181 >= def_var_Long_2182) {
            def_var_Long_2179 = def_var_Long_2181 % 20
        } else if (def_var_Long_2179 > def_var_Long_2184) {
            def_var_Long_2179 = def_var_Long_2179 xor def_var_Long_2183
        } else if (def_var_Long_2182 != def_var_Long_2181) {
            def_var_Long_2179 = def_var_Long_2179 + 7
        } else if (503.toLong() >= def_var_Long_2182) {
            def_var_Long_2179 = 619 xor 29
        } else if (773.toLong() != def_var_Long_2182) {
            def_var_Long_2179 = 656 xor 31
        } else if (def_var_Long_2179 > def_var_Long_2180) {
            def_var_Long_2179 = def_var_Long_2180 + 25
        } else if (def_var_Long_2179 < def_var_Long_2181) {
            def_var_Long_2179 = def_var_Long_2182 * def_var_Long_2183
        } else if (1001.toLong() <= def_var_Long_2181) {
            def_var_Long_2179 = 415 / 16
        } else if (def_var_Long_2179 > def_var_Long_2178) {
            def_var_Long_2179 = def_var_Long_2181 * def_var_Long_2183
        } else if (def_var_Long_2179 > def_var_Long_2181) {
            def_var_Long_2179 = def_var_Long_2182 - def_var_Long_2178
        } else if (def_var_Long_2179 > def_var_Long_2178) {
            def_var_Long_2179 = def_var_Long_2184 and def_var_Long_2180
        } else {
            def_var_Long_2179 = 275.toLong() * def_var_Long_2180
        }
    }
    return def_var_Long_2179.toInt()
}

fun reboant(def_var_Int_2185: Int): Int {
    var def_var_Int_2186: Int = def_var_Int_2185 % 10
    var def_var_Int_2187: Int = 6
    var def_var_Int_2188: Int = 20
    var def_var_Int_2189: Int = 19
    var def_var_Int_2190: Int = 29
    var def_var_Int_2191: Int = 14
    var def_var_Int_2192: Int = 21
    var def_var_Int_2193: Int = 16
    var def_var_Int_2194: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2194 = def_var_Int_2187 - 17
        def_var_Int_2194 = def_var_Int_2189 xor def_var_Int_2187
        def_var_Int_2194 = def_var_Int_2189 % def_var_Int_2190
        def_var_Int_2194 = def_var_Int_2187 % 30
        def_var_Int_2194 = def_var_Int_2186 / def_var_Int_2187
        def_var_Int_2194 = def_var_Int_2192 - def_var_Int_2191
        def_var_Int_2194 = 761 - 24
        def_var_Int_2194 = def_var_Int_2191 or def_var_Int_2190
        def_var_Int_2194 = def_var_Int_2191 / def_var_Int_2186
        def_var_Int_2194 = def_var_Int_2187 + def_var_Int_2188
    }
    return def_var_Int_2194
}

fun steelhead(def_var_Int_2195: Int): Int {
    var def_var_String_2196: String = "hylozoism"
    var def_var_String_2197: String = "sheath"
    var def_var_String_2198: String = "hutches"
    var def_var_String_2199: String = "certain"
    var def_var_String_2200: String = "safeguarder"
    var def_var_String_2201: String = "bisagre"
    var def_var_String_2202: String = "outskill"
    var def_var_String_2203: String = "resterilizing"
    var def_var_String_2204: String = "agathism"
    def_var_String_2196 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_2196.startsWith(def_var_String_2200)) {
            def_var_String_2196 = def_var_String_2199.removePrefix(def_var_String_2196)
        } else if (def_var_String_2196.equals(def_var_String_2203)) {
            def_var_String_2196 = def_var_String_2197.substringAfterLast(def_var_String_2198)
        } else if (def_var_String_2196.equals(def_var_String_2197)) {
            def_var_String_2196 = def_var_String_2198.commonPrefixWith(def_var_String_2204)
        } else if (def_var_String_2198.equals(def_var_String_2203)) {
            def_var_String_2196 = "globularness".commonPrefixWith("tughra")
        } else if (def_var_String_2204.equals(def_var_String_2201)) {
            def_var_String_2196 = def_var_String_2203.substringAfterLast("tassago")
        } else if (def_var_String_2197.startsWith(def_var_String_2201)) {
            def_var_String_2196 = def_var_String_2201.removeSuffix("coniopterygidae")
        } else if (def_var_String_2198.startsWith(def_var_String_2197)) {
            def_var_String_2196 = "tinfuls".commonSuffixWith("groundout")
        } else if (def_var_String_2196.startsWith(def_var_String_2199)) {
            def_var_String_2196 = def_var_String_2196.removeSuffix(def_var_String_2203)
        } else if (def_var_String_2196.equals(def_var_String_2198)) {
            def_var_String_2196 = def_var_String_2204.substringBeforeLast(def_var_String_2200)
        } else if (def_var_String_2196.equals(def_var_String_2198)) {
            def_var_String_2196 = def_var_String_2201.commonSuffixWith(def_var_String_2198)
        } else if (def_var_String_2196.startsWith(def_var_String_2198)) {
            def_var_String_2196 = def_var_String_2199.removePrefix("quinnat")
        } else if (def_var_String_2204.contains(def_var_String_2201)) {
            def_var_String_2196 = def_var_String_2203.substringAfter("archdeaconship")
        } else if (def_var_String_2196.startsWith(def_var_String_2203)) {
            def_var_String_2196 = def_var_String_2202.removeSuffix("cakehouse")
        } else {
            def_var_String_2196 = "passement".substringBeforeLast(def_var_String_2201)
        }
    }
//$ def_var_String_2196

    if (def_var_String_2196.endsWith("delthyrium")) {
        return def_var_Int_2195
    }
    return -1
}

fun mohoohoo(def_var_Int_2205: Int): Int {
    var def_var_Long_2206: Long = def_var_Int_2205.toLong()
    var def_var_Long_2207: Long = System.currentTimeMillis()
    var def_var_Long_2208: Long = System.currentTimeMillis()
    var def_var_Long_2209: Long = System.currentTimeMillis()
    var def_var_Long_2210: Long = System.currentTimeMillis()
    var def_var_Long_2211: Long = System.currentTimeMillis()
    var def_var_Long_2212: Long = System.currentTimeMillis()
    var def_var_Long_2213: Long = System.currentTimeMillis()
    var def_var_Long_2214: Long = System.currentTimeMillis()
    var def_var_Long_2215: Long = System.currentTimeMillis()
    def_var_Long_2208 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_2208 != def_var_Long_2211) {
            def_var_Long_2208 = def_var_Long_2213 * def_var_Long_2208
        } else if (def_var_Long_2207 < def_var_Long_2214) {
            def_var_Long_2208 = def_var_Long_2210 or 13
        } else if (217.toLong() >= def_var_Long_2213) {
            def_var_Long_2208 = 388 / 27
        } else if (92.toLong() >= def_var_Long_2215) {
            def_var_Long_2208 = 720 and 19
        } else if (def_var_Long_2208 < def_var_Long_2214) {
            def_var_Long_2208 = def_var_Long_2214 * def_var_Long_2210
        } else if (170.toLong() == def_var_Long_2206) {
            def_var_Long_2208 = 150 or 21
        } else if (def_var_Long_2208 > def_var_Long_2214) {
            def_var_Long_2208 = def_var_Long_2211 - def_var_Long_2214
        } else if (def_var_Long_2212 >= def_var_Long_2209) {
            def_var_Long_2208 = def_var_Long_2215 / 29
        } else if (def_var_Long_2208 <= def_var_Long_2209) {
            def_var_Long_2208 = def_var_Long_2214 / def_var_Long_2212
        } else if (707.toLong() <= def_var_Long_2209) {
            def_var_Long_2208 = 135 - 27
        } else if (755.toLong() != def_var_Long_2207) {
            def_var_Long_2208 = 315 * 16
        } else if (def_var_Long_2214 == def_var_Long_2215) {
            def_var_Long_2208 = def_var_Long_2214 + 28
        } else if (def_var_Long_2208 != def_var_Long_2207) {
            def_var_Long_2208 = def_var_Long_2214 and def_var_Long_2206
        } else if (def_var_Long_2208 != def_var_Long_2215) {
            def_var_Long_2208 = def_var_Long_2213 * def_var_Long_2210
        } else if (313.toLong() < def_var_Long_2213) {
            def_var_Long_2208 = 816 xor 9
        } else if (901.toLong() == def_var_Long_2214) {
            def_var_Long_2208 = 175 - 2
        } else {
            def_var_Long_2208 = 95.toLong() and def_var_Long_2209
        }
    }
    return def_var_Long_2208.toInt()
}

fun habilimental(def_var_Int_2216: Int): Int {//Function call
    var def_var_Int_2217: Int = 424
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_2217 = reboant(def_var_Int_2217)
        def_var_Int_2217 = unpatted(120)
        def_var_Int_2217 = merrily(def_var_Int_2217)
        def_var_Int_2217 = killing(95)
        def_var_Int_2217 = prefeast(def_var_Int_2216)
        def_var_Int_2217 = titrants(279) * exilarchate(def_var_Int_2216)
        def_var_Int_2217 = cheka(48)
        def_var_Int_2217 = titrants(877)
        def_var_Int_2217 = steelhead(458) / merrily(def_var_Int_2217)
        def_var_Int_2217 = cheka(646)
        def_var_Int_2217 = harlequins(def_var_Int_2216)
        def_var_Int_2217 = venetian(324) - kashers(def_var_Int_2217)
        def_var_Int_2217 = tearlike(689) * steelhead(def_var_Int_2216)
        def_var_Int_2217 = titrants(141)
        def_var_Int_2217 = harlequins(946)
        def_var_Int_2217 = reboant(625) % merrily(def_var_Int_2217)
    }
    return def_var_Int_2217
}

fun output(def_var_Int_2218: Int): Int {//Function call(fork)
    var def_var_Int_2219: Int = 783
    if (System.currentTimeMillis().toInt() == 0) {
        if (unpatted(def_var_Int_2219) == 1007) {
        } else if (titrants(def_var_Int_2219) == exilarchate(311)) {
            def_var_Int_2219 = semiacademically(def_var_Int_2219)
        } else if (habilimental(def_var_Int_2219) < 959) {
            def_var_Int_2219 = otherdom(841)
            def_var_Int_2219 = exilarchate(def_var_Int_2219) / reboant(def_var_Int_2219)
        } else if (killing(def_var_Int_2219) <= merrily(79)) {
            def_var_Int_2219 = venetian(def_var_Int_2219)
        } else if (harlequins(def_var_Int_2219) > 284) {
            def_var_Int_2219 = exilarchate(290)
        } else if (otherdom(def_var_Int_2219) == titrants(535)) {
            def_var_Int_2219 = tearlike(def_var_Int_2219)
            def_var_Int_2219 = prefeast(def_var_Int_2219) and otherdom(def_var_Int_2219)
        } else if (venetian(def_var_Int_2219) == 969) {
            def_var_Int_2219 = tearlike(246)
            def_var_Int_2219 = killing(def_var_Int_2219) % semiacademically(def_var_Int_2219)
            def_var_Int_2219 = prefeast(def_var_Int_2219) xor steelhead(def_var_Int_2219)
        } else if (killing(def_var_Int_2219) < 303) {
            def_var_Int_2219 = mohoohoo(814)
            def_var_Int_2219 = otherdom(def_var_Int_2219) and exilarchate(def_var_Int_2219)
        } else {
            def_var_Int_2219 = kashers(def_var_Int_2219)
        }
    }
    return def_var_Int_2219
}

var def_var_Boolean_2220: Boolean = false
fun getweatherliness(): Boolean {
    return def_var_Boolean_2220
}

fun setrigsmaal(def_var_Boolean_2221: Boolean) {
    def_var_Boolean_2220 = def_var_Boolean_2221
}

var def_var_Int_2225: Int = 352
fun getwoodchucks(): Int {
    return def_var_Int_2225
}

fun setenfilade(def_var_Int_2226: Int) {
    def_var_Int_2225 = def_var_Int_2226
}

var def_var_Long_2227: Long = 191
fun getdeviators(): Long {
    return def_var_Long_2227
}

fun setreleivos(def_var_Long_2228: Long) {
    def_var_Long_2227 = def_var_Long_2228
}

var def_var_Double_2230: Double = 577.0
fun getwormil(): Double {
    return def_var_Double_2230
}

fun setincremented(def_var_Double_2231: Double) {
    def_var_Double_2230 = def_var_Double_2231
}

var def_var_String_2232: String = "equalisation"
fun getunskepticalness(): String {
    return def_var_String_2232
}

fun setconfuser(def_var_String_2233: String) {
    def_var_String_2232 = def_var_String_2233
}


/**
 * Date：2024/4/1
 * Describe:
 */
@SuppressLint("StaticFieldLeak")
object BasementAd : BasementHImpl() {
    private var isBasement = false
    private var lastBasementTime = 0L
    private var basementCTime = 0L
    private var T_BASE = 1000 * 60
    private var mBasement: Any? = null
    var mBasementId = ""
    var timerJob: Job? = null
    var timeListener: TimeListener? = null
    private lateinit var mContext: Context
    private val mPerson by lazy { BasementPerson(this) }

    fun initBasement(context: Context) {
        var def_var_String_2235: String = "septuplicate"
        var def_var_String_2236: String = "metaigneous"
        var def_var_String_2237: String = "chiasmatype"
        var def_var_String_2238: String = "unchallengeable"
        var def_var_String_2239: String = "signally"
        var def_var_String_2240: String = "crablet"
        var def_var_String_2241: String = "aeraria"
        var def_var_String_2242: String = "irreformability"
        def_var_String_2238 = Math.random().toString()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_String_2238.startsWith(def_var_String_2241)) {
                def_var_String_2238 = def_var_String_2238.removeSurrounding(def_var_String_2236)
            } else if (def_var_String_2235.startsWith(def_var_String_2241)) {
                def_var_String_2238 = def_var_String_2236.substringAfterLast("foraminule")
            } else if (def_var_String_2238.contains(def_var_String_2235)) {
                def_var_String_2238 = def_var_String_2237.removeSurrounding(def_var_String_2240)
            } else if (def_var_String_2235.endsWith(def_var_String_2235)) {
                def_var_String_2238 = "cresotinic".removeSuffix("intorts")
            } else if (def_var_String_2241.equals(def_var_String_2238)) {
                def_var_String_2238 = def_var_String_2241.substringAfter("nonmonarchial")
            } else if (def_var_String_2236.startsWith(def_var_String_2238)) {
                def_var_String_2238 = def_var_String_2239.removeSuffix("behowl")
            } else if (def_var_String_2238.endsWith(def_var_String_2237)) {
                def_var_String_2238 = def_var_String_2239.substringBeforeLast(def_var_String_2236)
            } else if (def_var_String_2238.contains(def_var_String_2240)) {
                def_var_String_2238 = def_var_String_2239.substringBefore(def_var_String_2236)
            } else if (def_var_String_2238.equals(def_var_String_2235)) {
                def_var_String_2238 = def_var_String_2235.substringBefore(def_var_String_2238)
            } else if (def_var_String_2238.startsWith(def_var_String_2242)) {
                def_var_String_2238 = def_var_String_2238.substringAfterLast(def_var_String_2241)
            } else if (def_var_String_2238.contains(def_var_String_2237)) {
                def_var_String_2238 = def_var_String_2237.removePrefix(def_var_String_2238)
            } else if (def_var_String_2235.equals(def_var_String_2237)) {
                def_var_String_2238 = "turpeth".substringBeforeLast("echinodermic")
            } else if (def_var_String_2242.startsWith(def_var_String_2235)) {
                def_var_String_2238 = def_var_String_2238.substringBefore("aute")
            } else if (def_var_String_2238.endsWith(def_var_String_2235)) {
                def_var_String_2238 = def_var_String_2239.removePrefix(def_var_String_2238)
            } else if (def_var_String_2235.startsWith(def_var_String_2239)) {
                def_var_String_2238 = def_var_String_2236.substringAfter("monotelephone")
            } else if (def_var_String_2242.equals(def_var_String_2236)) {
                def_var_String_2238 = "unconsecutive".removeSurrounding("hymnographer")
            } else if (def_var_String_2238.equals(def_var_String_2242)) {
                def_var_String_2238 = def_var_String_2236.commonPrefixWith(def_var_String_2242)
            } else if (def_var_String_2238.contains(def_var_String_2240)) {
                def_var_String_2238 = def_var_String_2235.removePrefix(def_var_String_2239)
            } else if (def_var_String_2242.startsWith(def_var_String_2236)) {
                def_var_String_2238 = def_var_String_2239.substringBefore("subliminal")
            } else if (def_var_String_2238.contains(def_var_String_2236)) {
                def_var_String_2238 = def_var_String_2239.substringBefore(def_var_String_2237)
            } else {
                def_var_String_2238 = "prepromoting".substringBeforeLast(def_var_String_2237)
            }
        }
//$ def_var_String_2238

        mContext = context
        ATSDK.setNetworkLogDebug(BuildConfig.DEBUG)
        ATSDK.init(context, "a66136655a5dda", "aab7fc69e421a2c62ca062c60cec30821")
        timerJob = CoroutineScope(Dispatchers.Main).launch {
            var def_var_Long_2243: Long = System.currentTimeMillis()
            var def_var_Long_2244: Long = def_var_Long_2243 / 15
            var def_var_Long_2245: Long = def_var_Long_2243 xor 4
            var def_var_Long_2246: Long = def_var_Long_2243 + 2
            var def_var_Long_2247: Long = def_var_Long_2245 or 30
            def_var_Long_2244 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_2244 == def_var_Long_2247) {
                    def_var_Long_2244 = def_var_Long_2247 / def_var_Long_2246
                } else if (def_var_Long_2244 == def_var_Long_2247) {
                    def_var_Long_2244 = def_var_Long_2244 / def_var_Long_2245
                } else if (def_var_Long_2244 != def_var_Long_2247) {
                    def_var_Long_2244 = def_var_Long_2247 or def_var_Long_2246
                } else if (254.toLong() <= def_var_Long_2245) {
                    def_var_Long_2244 = 748 or 18
                } else if (946.toLong() != def_var_Long_2246) {
                    def_var_Long_2244 = 213 % 5
                } else if (def_var_Long_2244 < def_var_Long_2245) {
                    def_var_Long_2244 = def_var_Long_2246 - def_var_Long_2247
                } else if (def_var_Long_2247 >= def_var_Long_2243) {
                    def_var_Long_2244 = def_var_Long_2244 + 31
                } else if (def_var_Long_2244 <= def_var_Long_2247) {
                    def_var_Long_2244 = def_var_Long_2244 - 16
                } else if (950.toLong() < def_var_Long_2247) {
                    def_var_Long_2244 = 445 - 2
                } else if (def_var_Long_2244 != def_var_Long_2243) {
                    def_var_Long_2244 = def_var_Long_2243 and def_var_Long_2246
                } else if (def_var_Long_2243 > def_var_Long_2245) {
                    def_var_Long_2244 = def_var_Long_2247 and 16
                } else if (def_var_Long_2246 < def_var_Long_2245) {
                    def_var_Long_2244 = def_var_Long_2245 % 1
                } else if (def_var_Long_2245 <= def_var_Long_2243) {
                    def_var_Long_2244 = def_var_Long_2246 + 24
                } else if (def_var_Long_2243 != def_var_Long_2246) {
                    def_var_Long_2244 = def_var_Long_2243 + 1
                } else if (def_var_Long_2244 < def_var_Long_2243) {
                    def_var_Long_2244 = def_var_Long_2245 xor def_var_Long_2247
                } else if (def_var_Long_2244 == def_var_Long_2247) {
                    def_var_Long_2244 = def_var_Long_2247 - def_var_Long_2244
                } else if (def_var_Long_2246 >= def_var_Long_2245) {
                    def_var_Long_2244 = def_var_Long_2243 % 18
                } else {
                    def_var_Long_2244 = 503.toLong() / def_var_Long_2243
                }
            }
//$ def_var_Long_2244.toInt()

            delay(5000)
            while (true) {
                goBasement()
                delay(WindowsHelper.windowsBean.timeCWindows)
                timeListener?.oneEvent()
            }
        }
    }

    fun goBasement() {
        var def_var_Int_2248: Int = 10
        var def_var_Int_2249: Int = 16
        var def_var_Int_2250: Int = 21
        var def_var_Int_2251: Int = 22
        var def_var_Int_2252: Int = 16
        var def_var_Int_2253: Int = 19
        var def_var_Int_2254: Int = 0
        if (System.currentTimeMillis().toInt() == 0) {
            def_var_Int_2254 = def_var_Int_2252 + def_var_Int_2249
            def_var_Int_2254 = 1023 or 10
            def_var_Int_2254 = 824 - 5
            def_var_Int_2254 = 1003 / 7
            def_var_Int_2254 = def_var_Int_2248 - 7
            def_var_Int_2254 = def_var_Int_2248 * def_var_Int_2250
            def_var_Int_2254 = def_var_Int_2248 or 5
            def_var_Int_2254 = 967 or 18
            def_var_Int_2254 = 425 / 27
            def_var_Int_2254 = def_var_Int_2252 and def_var_Int_2248
        }
//$ def_var_Int_2254

        if (mBasementId.isBlank()) return
        if (isBasement) {
            var def_var_String_2255: String = ""
            var def_var_Double_2256: Double = Math.random()
            if ((935.0 - getwormil()) > 0.0) {
                setincremented(getwormil() + def_var_Double_2256)
                if ((636.0 - def_var_Double_2256) > 0.0) {
                    setrigsmaal(Math.random() > 0.5)
                    def_var_String_2255 = Math.random().toString()
                } else {
                    setrigsmaal(Math.random() > 0.5)
                    def_var_String_2255 = Math.random().toString()
                }
            } else if ((getdeviators() - 356) > 0) {
                def_var_Double_2256 = Math.random()
                if ((682.0 - def_var_Double_2256) > 0.0) {
                    def_var_Double_2256 = 39.toDouble()
                } else if ((880.0 - def_var_Double_2256) > 0.0) {
                    def_var_Double_2256 = 836.toDouble()
                } else if ((989.0 - def_var_Double_2256) > 0.0) {
                    def_var_Double_2256 = 186.toDouble()
                } else if ((486.0 - def_var_Double_2256) > 0.0) {
                    def_var_Double_2256 = 670.toDouble()
                } else {
                    def_var_Double_2256 = 237.toDouble()
                }
                setincremented(def_var_Double_2256)
                def_var_String_2255 = Math.random().toString()
            }
            setconfuser(def_var_String_2255)

            if (System.currentTimeMillis() - lastBasementTime < T_BASE) {
                return
            }
        }
        if (isCanGoBasement()) {
            DoorLog.go("have Ad cache")
            return
        }
        isBasement = true
        lastBasementTime = System.currentTimeMillis()
        mBasement = mPerson.request(mContext, mBasementId)
    }

    private var finishCall: (() -> Unit)? = null

    fun openTheBasement(activity: Activity) {
        var def_var_String_2271: String = ""
        var def_var_Double_2272: Double = Math.random()
        if ((941.0 - getwormil()) > 0.0) {
            setincremented(getwormil() + def_var_Double_2272)
            if ((928.0 - def_var_Double_2272) > 0.0) {
                setrigsmaal(Math.random() > 0.5)
                def_var_String_2271 = Math.random().toString()
            } else {
                setrigsmaal(Math.random() > 0.5)
                def_var_String_2271 = Math.random().toString()
            }
        } else if ((getdeviators() - 976) > 0) {
            def_var_Double_2272 = Math.random()
            if ((93.0 - def_var_Double_2272) > 0.0) {
                def_var_Double_2272 = 894.toDouble()
            } else if ((993.0 - def_var_Double_2272) > 0.0) {
                def_var_Double_2272 = 858.toDouble()
            } else if ((144.0 - def_var_Double_2272) > 0.0) {
                def_var_Double_2272 = 592.toDouble()
            } else if ((110.0 - def_var_Double_2272) > 0.0) {
                def_var_Double_2272 = 262.toDouble()
            } else {
                def_var_Double_2272 = 599.toDouble()
            }
            setincremented(def_var_Double_2272)
            def_var_String_2271 = Math.random().toString()
        }
        setconfuser(def_var_String_2271)

        when (val ad = mBasement) {
            is ATInterstitial -> {
                var def_var_Int_2273: Int = 22
                var def_var_Int_2274: Int = 21
                var def_var_Int_2275: Int = 29
                var def_var_Int_2276: Int = 12
                var def_var_Int_2277: Int = 9
                var def_var_Int_2278: Int = 8
                var def_var_Int_2279: Int = 9
                var def_var_Int_2280: Int = 10
                var def_var_Int_2281: Int = 0
                if (System.currentTimeMillis().toInt() == 0) {
                    def_var_Int_2281 = def_var_Int_2279 xor def_var_Int_2277
                    def_var_Int_2281 = def_var_Int_2276 * 7
                    def_var_Int_2281 = 215 + 7
                    def_var_Int_2281 = def_var_Int_2280 + 1
                    def_var_Int_2281 = 79 * 8
                    def_var_Int_2281 = 810 - 6
                    def_var_Int_2281 = def_var_Int_2278 % def_var_Int_2275
                    def_var_Int_2281 = 787 or 31
                    def_var_Int_2281 = def_var_Int_2275 and 15
                    def_var_Int_2281 = def_var_Int_2277 and def_var_Int_2273
                    def_var_Int_2281 = def_var_Int_2275 * def_var_Int_2278
                    def_var_Int_2281 = def_var_Int_2279 and 16
                    def_var_Int_2281 = def_var_Int_2275 + def_var_Int_2273
                    def_var_Int_2281 = def_var_Int_2274 + 2
                    def_var_Int_2281 = 227 % 26
                }
//$ def_var_Int_2281

                finishCall = {
                    var def_var_Long_2282: Long = System.currentTimeMillis()
                    var def_var_Long_2283: Long = def_var_Long_2282 / 8
                    var def_var_Long_2284: Long = def_var_Long_2283 and 31
                    var def_var_Long_2285: Long = def_var_Long_2282 / 18
                    var def_var_Long_2286: Long = def_var_Long_2283 - 5
                    var def_var_Long_2287: Long = def_var_Long_2285 * 29
                    var def_var_Long_2288: Long = def_var_Long_2287 % 26
                    def_var_Long_2284 = System.currentTimeMillis()
                    if (System.currentTimeMillis().toInt() == 0) {
                        if (def_var_Long_2284 >= def_var_Long_2286) {
                            def_var_Long_2284 = def_var_Long_2288 + def_var_Long_2283
                        } else if (42.toLong() >= def_var_Long_2282) {
                            def_var_Long_2284 = 567 + 14
                        } else if (def_var_Long_2283 == def_var_Long_2284) {
                            def_var_Long_2284 = def_var_Long_2287 or 18
                        } else if (def_var_Long_2282 >= def_var_Long_2285) {
                            def_var_Long_2284 = def_var_Long_2287 / 6
                        } else if (def_var_Long_2284 == def_var_Long_2282) {
                            def_var_Long_2284 = def_var_Long_2282 and 23
                        } else if (def_var_Long_2284 != def_var_Long_2287) {
                            def_var_Long_2284 = def_var_Long_2287 xor def_var_Long_2286
                        } else if (def_var_Long_2285 <= def_var_Long_2287) {
                            def_var_Long_2284 = def_var_Long_2286 % 8
                        } else if (def_var_Long_2284 <= def_var_Long_2286) {
                            def_var_Long_2284 = def_var_Long_2287 + def_var_Long_2285
                        } else if (def_var_Long_2284 > def_var_Long_2282) {
                            def_var_Long_2284 = def_var_Long_2282 - def_var_Long_2285
                        } else if (1004.toLong() >= def_var_Long_2288) {
                            def_var_Long_2284 = 186 % 31
                        } else if (def_var_Long_2283 > def_var_Long_2285) {
                            def_var_Long_2284 = def_var_Long_2285 * 28
                        } else if (def_var_Long_2287 >= def_var_Long_2282) {
                            def_var_Long_2284 = def_var_Long_2282 % 20
                        } else if (def_var_Long_2283 == def_var_Long_2287) {
                            def_var_Long_2284 = def_var_Long_2285 / 1
                        } else if (def_var_Long_2284 >= def_var_Long_2287) {
                            def_var_Long_2284 = def_var_Long_2285 + def_var_Long_2283
                        } else if (def_var_Long_2284 == def_var_Long_2282) {
                            def_var_Long_2284 = def_var_Long_2283 - def_var_Long_2288
                        } else if (def_var_Long_2284 <= def_var_Long_2285) {
                            def_var_Long_2284 = def_var_Long_2284 * def_var_Long_2288
                        } else if (def_var_Long_2284 >= def_var_Long_2288) {
                            def_var_Long_2284 = def_var_Long_2288 and def_var_Long_2287
                        } else {
                            def_var_Long_2284 = 1019.toLong() / def_var_Long_2286
                        }
                    }
//$ def_var_Long_2284.toInt()

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                        var def_var_Int_2289: Int = 10
                        var def_var_Int_2290: Int = 23
                        var def_var_Int_2291: Int = 13
                        var def_var_Int_2292: Int = 31
                        var def_var_Int_2293: Int = 26
                        var def_var_Int_2294: Int = 0
                        if (System.currentTimeMillis().toInt() == 0) {
                            def_var_Int_2294 = 696 + 11
                            def_var_Int_2294 = def_var_Int_2291 % 27
                            def_var_Int_2294 = 614 xor 11
                            def_var_Int_2294 = def_var_Int_2292 or def_var_Int_2289
                            def_var_Int_2294 = def_var_Int_2289 and def_var_Int_2292
                            def_var_Int_2294 = def_var_Int_2293 + def_var_Int_2291
                            def_var_Int_2294 = def_var_Int_2292 % 16
                            def_var_Int_2294 = def_var_Int_2292 + 24
                            def_var_Int_2294 = 811 or 9
                            def_var_Int_2294 = 479 * 18
                            def_var_Int_2294 = def_var_Int_2290 % 23
                            def_var_Int_2294 = 29 - 11
                            def_var_Int_2294 = def_var_Int_2289 * def_var_Int_2292
                            def_var_Int_2294 = def_var_Int_2291 xor 13
                            def_var_Int_2294 = 870 / 7
                        }
//$ def_var_Int_2294

                        activity.finishAndRemoveTask()
                    } else {
                        var def_var_Long_2295: Long = System.currentTimeMillis()
                        var def_var_Long_2296: Long = def_var_Long_2295 % 8
                        var def_var_Long_2297: Long = def_var_Long_2295 and 30
                        var def_var_Long_2298: Long = def_var_Long_2295 xor 11
                        var def_var_Long_2299: Long = def_var_Long_2298 / 4
                        var def_var_Long_2300: Long = def_var_Long_2296 * 4
                        var def_var_Long_2301: Long = def_var_Long_2295 or 18
                        def_var_Long_2297 = System.currentTimeMillis()
                        if (System.currentTimeMillis().toInt() == 0) {
                            if (def_var_Long_2297 <= def_var_Long_2298) {
                                def_var_Long_2297 = def_var_Long_2297 xor def_var_Long_2295
                            } else if (def_var_Long_2297 <= def_var_Long_2301) {
                                def_var_Long_2297 = def_var_Long_2301 / def_var_Long_2296
                            } else if (def_var_Long_2297 != def_var_Long_2295) {
                                def_var_Long_2297 = def_var_Long_2300 or def_var_Long_2296
                            } else if (770.toLong() > def_var_Long_2299) {
                                def_var_Long_2297 = 864 and 6
                            } else if (def_var_Long_2297 > def_var_Long_2298) {
                                def_var_Long_2297 = def_var_Long_2301 or 7
                            } else if (def_var_Long_2297 < def_var_Long_2300) {
                                def_var_Long_2297 = def_var_Long_2297 and def_var_Long_2301
                            } else if (def_var_Long_2296 > def_var_Long_2297) {
                                def_var_Long_2297 = def_var_Long_2295 - 24
                            } else if (def_var_Long_2297 <= def_var_Long_2295) {
                                def_var_Long_2297 = def_var_Long_2301 + def_var_Long_2295
                            } else if (9.toLong() < def_var_Long_2300) {
                                def_var_Long_2297 = 131 % 17
                            } else if (def_var_Long_2298 != def_var_Long_2296) {
                                def_var_Long_2297 = def_var_Long_2296 / 19
                            } else if (def_var_Long_2297 != def_var_Long_2299) {
                                def_var_Long_2297 = def_var_Long_2301 and def_var_Long_2298
                            } else if (def_var_Long_2301 <= def_var_Long_2296) {
                                def_var_Long_2297 = def_var_Long_2298 or 9
                            } else if (def_var_Long_2297 == def_var_Long_2298) {
                                def_var_Long_2297 = def_var_Long_2300 - def_var_Long_2296
                            } else if (def_var_Long_2297 == def_var_Long_2299) {
                                def_var_Long_2297 = def_var_Long_2297 or def_var_Long_2301
                            } else if (def_var_Long_2297 < def_var_Long_2295) {
                                def_var_Long_2297 = def_var_Long_2295 or def_var_Long_2298
                            } else if (def_var_Long_2297 <= def_var_Long_2296) {
                                def_var_Long_2297 = def_var_Long_2297 or def_var_Long_2299
                            } else if (def_var_Long_2297 != def_var_Long_2296) {
                                def_var_Long_2297 = def_var_Long_2295 and def_var_Long_2296
                            } else if (def_var_Long_2297 >= def_var_Long_2298) {
                                def_var_Long_2297 = def_var_Long_2301 % def_var_Long_2298
                            } else if (def_var_Long_2301 <= def_var_Long_2299) {
                                def_var_Long_2297 = def_var_Long_2297 % 27
                            } else if (def_var_Long_2297 == def_var_Long_2299) {
                                def_var_Long_2297 = def_var_Long_2295 xor def_var_Long_2296
                            } else {
                                def_var_Long_2297 = 209.toLong() and def_var_Long_2300
                            }
                        }
//$ def_var_Long_2297.toInt()

                        activity.finish()
                    }
                }
                mPerson.showHidePerson(activity, ad)
                mBasement = null
            }

            else -> {
                var def_var_String_2302: String = "niddering"
                var def_var_String_2303: String = "overargue"
                var def_var_String_2304: String = "kiddishness"
                var def_var_String_2305: String = "endmatcher"
                var def_var_String_2306: String = "internalizes"
                var def_var_String_2307: String = "sprier"
                def_var_String_2307 = Math.random().toString()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_String_2307.endsWith(def_var_String_2305)) {
                        def_var_String_2307 =
                            def_var_String_2307.substringAfter(def_var_String_2302)
                    } else if (def_var_String_2307.endsWith(def_var_String_2302)) {
                        def_var_String_2307 = def_var_String_2305.removePrefix(def_var_String_2306)
                    } else if (def_var_String_2302.equals(def_var_String_2302)) {
                        def_var_String_2307 = "bespread".substringBeforeLast("topside")
                    } else if (def_var_String_2307.startsWith(def_var_String_2303)) {
                        def_var_String_2307 =
                            def_var_String_2303.commonPrefixWith(def_var_String_2305)
                    } else if (def_var_String_2306.startsWith(def_var_String_2302)) {
                        def_var_String_2307 = "subventioned".removePrefix("secularise")
                    } else if (def_var_String_2307.endsWith(def_var_String_2304)) {
                        def_var_String_2307 =
                            def_var_String_2307.substringBeforeLast(def_var_String_2303)
                    } else if (def_var_String_2306.equals(def_var_String_2302)) {
                        def_var_String_2307 = def_var_String_2306.removeSuffix("toothbrushy")
                    } else if (def_var_String_2303.startsWith(def_var_String_2306)) {
                        def_var_String_2307 = def_var_String_2304.removeSurrounding("spinals")
                    } else if (def_var_String_2307.contains(def_var_String_2305)) {
                        def_var_String_2307 =
                            def_var_String_2305.commonPrefixWith(def_var_String_2302)
                    } else if (def_var_String_2307.startsWith(def_var_String_2302)) {
                        def_var_String_2307 = def_var_String_2304.substringBeforeLast("aweary")
                    } else if (def_var_String_2305.startsWith(def_var_String_2306)) {
                        def_var_String_2307 = "lessoning".commonSuffixWith("hailstones")
                    } else if (def_var_String_2305.equals(def_var_String_2304)) {
                        def_var_String_2307 = "unnaturalism".substringAfter("anoplonemertini")
                    } else if (def_var_String_2307.contains(def_var_String_2302)) {
                        def_var_String_2307 =
                            def_var_String_2304.substringBefore(def_var_String_2306)
                    } else {
                        def_var_String_2307 =
                            "nonpalpability".substringBeforeLast(def_var_String_2302)
                    }
                }
//$ def_var_String_2307

                mBasement = null
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                    var def_var_String_2308: String = ""
                    var def_var_Double_2309: Double = Math.random()
                    if ((514.0 - getwormil()) > 0.0) {
                        setincremented(getwormil() + def_var_Double_2309)
                        if ((392.0 - def_var_Double_2309) > 0.0) {
                            setrigsmaal(Math.random() > 0.5)
                            def_var_String_2308 = Math.random().toString()
                        } else {
                            setrigsmaal(Math.random() > 0.5)
                            def_var_String_2308 = Math.random().toString()
                        }
                    } else if ((getdeviators() - 878) > 0) {
                        def_var_Double_2309 = Math.random()
                        if ((793.0 - def_var_Double_2309) > 0.0) {
                            def_var_Double_2309 = 596.toDouble()
                        } else if ((314.0 - def_var_Double_2309) > 0.0) {
                            def_var_Double_2309 = 37.toDouble()
                        } else if ((807.0 - def_var_Double_2309) > 0.0) {
                            def_var_Double_2309 = 644.toDouble()
                        } else {
                            def_var_Double_2309 = 311.toDouble()
                        }
                        setincremented(def_var_Double_2309)
                        def_var_String_2308 = Math.random().toString()
                    }
                    setconfuser(def_var_String_2308)

                    activity.finishAndRemoveTask()
                } else {
                    var def_var_String_2310: String = ""
                    var def_var_Double_2311: Double = Math.random()
                    if ((919.0 - getwormil()) > 0.0) {
                        setincremented(getwormil() + def_var_Double_2311)
                        if ((567.0 - def_var_Double_2311) > 0.0) {
                            setrigsmaal(Math.random() > 0.5)
                            def_var_String_2310 = Math.random().toString()
                        } else {
                            setrigsmaal(Math.random() > 0.5)
                            def_var_String_2310 = Math.random().toString()
                        }
                    } else if ((getdeviators() - 65) > 0) {
                        def_var_Double_2311 = Math.random()
                        if ((850.0 - def_var_Double_2311) > 0.0) {
                            def_var_Double_2311 = 255.toDouble()
                        } else if ((467.0 - def_var_Double_2311) > 0.0) {
                            def_var_Double_2311 = 1004.toDouble()
                        } else if ((543.0 - def_var_Double_2311) > 0.0) {
                            def_var_Double_2311 = 65.toDouble()
                        } else if ((383.0 - def_var_Double_2311) > 0.0) {
                            def_var_Double_2311 = 316.toDouble()
                        } else {
                            def_var_Double_2311 = 445.toDouble()
                        }
                        setincremented(def_var_Double_2311)
                        def_var_String_2310 = Math.random().toString()
                    }
                    setconfuser(def_var_String_2310)

                    activity.finish()
                }
                goBasement()
            }
        }
    }

    fun isCanGoBasement(): Boolean {
        val ad = mBasement ?: return false
        if (System.currentTimeMillis() - basementCTime > T_BASE * 55) return false
        when (ad) {
            is ATInterstitial -> return ad.isAdReady
            is ATNative -> return ad.nativeAd != null
        }
        return false
    }

    override fun onInterstitialAdLoaded() {
        var def_var_Long_2321: Long = System.currentTimeMillis()
        var def_var_Long_2322: Long = def_var_Long_2321 and 6
        var def_var_Long_2323: Long = def_var_Long_2321 and 16
        var def_var_Long_2324: Long = def_var_Long_2323 - 14
        var def_var_Long_2325: Long = def_var_Long_2324 - 29
        var def_var_Long_2326: Long = def_var_Long_2323 or 12
        def_var_Long_2326 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_2326 <= def_var_Long_2323) {
                def_var_Long_2326 = def_var_Long_2322 - def_var_Long_2326
            } else if (def_var_Long_2326 < def_var_Long_2323) {
                def_var_Long_2326 = def_var_Long_2325 or def_var_Long_2326
            } else if (def_var_Long_2326 == def_var_Long_2325) {
                def_var_Long_2326 = def_var_Long_2321 + def_var_Long_2322
            } else if (def_var_Long_2326 < def_var_Long_2325) {
                def_var_Long_2326 = def_var_Long_2323 * def_var_Long_2322
            } else if (374.toLong() > def_var_Long_2324) {
                def_var_Long_2326 = 649 or 31
            } else if (def_var_Long_2326 < def_var_Long_2321) {
                def_var_Long_2326 = def_var_Long_2321 * def_var_Long_2323
            } else if (def_var_Long_2325 == def_var_Long_2322) {
                def_var_Long_2326 = def_var_Long_2326 / 5
            } else if (def_var_Long_2326 != def_var_Long_2323) {
                def_var_Long_2326 = def_var_Long_2323 % 13
            } else if (def_var_Long_2323 >= def_var_Long_2325) {
                def_var_Long_2326 = def_var_Long_2326 xor 30
            } else if (def_var_Long_2326 <= def_var_Long_2325) {
                def_var_Long_2326 = def_var_Long_2321 - def_var_Long_2324
            } else if (def_var_Long_2326 <= def_var_Long_2321) {
                def_var_Long_2326 = def_var_Long_2322 / 20
            } else if (def_var_Long_2321 == def_var_Long_2326) {
                def_var_Long_2326 = def_var_Long_2324 and 22
            } else if (def_var_Long_2324 <= def_var_Long_2321) {
                def_var_Long_2326 = def_var_Long_2326 and 15
            } else if (def_var_Long_2326 == def_var_Long_2322) {
                def_var_Long_2326 = def_var_Long_2326 - def_var_Long_2325
            } else if (def_var_Long_2326 < def_var_Long_2324) {
                def_var_Long_2326 = def_var_Long_2325 - def_var_Long_2326
            } else if (792.toLong() > def_var_Long_2322) {
                def_var_Long_2326 = 787 * 9
            } else {
                def_var_Long_2326 = 115.toLong() xor def_var_Long_2323
            }
        }
//$ def_var_Long_2326.toInt()

        super.onInterstitialAdLoaded()
        isBasement = false
        basementCTime = System.currentTimeMillis()
    }

    override fun onInterstitialAdLoadFail(p0: AdError?) {
        var def_var_String_2327: String = ""
        var def_var_Double_2328: Double = Math.random()
        if ((308.0 - getwormil()) > 0.0) {
            setincremented(getwormil() + def_var_Double_2328)
            if ((716.0 - def_var_Double_2328) > 0.0) {
                setrigsmaal(Math.random() > 0.5)
                def_var_String_2327 = Math.random().toString()
            } else {
                setrigsmaal(Math.random() > 0.5)
                def_var_String_2327 = Math.random().toString()
            }
        } else if ((getdeviators() - 737) > 0) {
            def_var_Double_2328 = Math.random()
            if ((344.0 - def_var_Double_2328) > 0.0) {
                def_var_Double_2328 = 914.toDouble()
            } else if ((702.0 - def_var_Double_2328) > 0.0) {
                def_var_Double_2328 = 485.toDouble()
            } else if ((338.0 - def_var_Double_2328) > 0.0) {
                def_var_Double_2328 = 162.toDouble()
            } else if ((228.0 - def_var_Double_2328) > 0.0) {
                def_var_Double_2328 = 374.toDouble()
            } else {
                def_var_Double_2328 = 914.toDouble()
            }
            setincremented(def_var_Double_2328)
            def_var_String_2327 = Math.random().toString()
        }
        setconfuser(def_var_String_2327)

        super.onInterstitialAdLoadFail(p0)
        CoroutineScope(Dispatchers.IO).launch {
            var def_var_Int_2329: Int = 16
            var def_var_Int_2330: Int = 29
            var def_var_Int_2331: Int = 15
            var def_var_Int_2332: Int = 22
            var def_var_Int_2333: Int = 10
            var def_var_Int_2334: Int = 9
            var def_var_Int_2335: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_2335 = 60 and 12
                def_var_Int_2335 = def_var_Int_2331 xor def_var_Int_2334
                def_var_Int_2335 = def_var_Int_2330 - 12
                def_var_Int_2335 = def_var_Int_2329 xor 31
                def_var_Int_2335 = def_var_Int_2334 * def_var_Int_2330
                def_var_Int_2335 = def_var_Int_2334 * def_var_Int_2332
                def_var_Int_2335 = def_var_Int_2334 + 18
                def_var_Int_2335 = 457 or 3
                def_var_Int_2335 = def_var_Int_2330 xor 16
                def_var_Int_2335 = def_var_Int_2331 and def_var_Int_2330
                def_var_Int_2335 = def_var_Int_2330 and 14
                def_var_Int_2335 = def_var_Int_2330 * def_var_Int_2333
                def_var_Int_2335 = def_var_Int_2333 % 12
                def_var_Int_2335 = def_var_Int_2332 * def_var_Int_2333
                def_var_Int_2335 = def_var_Int_2331 or 15
                def_var_Int_2335 = def_var_Int_2334 or 7
                def_var_Int_2335 = def_var_Int_2330 - 31
                def_var_Int_2335 = 275 + 8
                def_var_Int_2335 = def_var_Int_2329 and 9
            }
//$ def_var_Int_2335

            delay(14031)
            isBasement = false
            withContext(Dispatchers.Main) {
                var def_var_String_2336: String = "unexcellently"
                var def_var_String_2337: String = "distrustingly"
                var def_var_String_2338: String = "flustery"
                var def_var_String_2339: String = "disincrust"
                var def_var_String_2340: String = "gastroduodenal"
                def_var_String_2338 = Math.random().toString()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_String_2338.equals(def_var_String_2336)) {
                        def_var_String_2338 =
                            def_var_String_2339.substringBeforeLast(def_var_String_2338)
                    } else if (def_var_String_2338.endsWith(def_var_String_2340)) {
                        def_var_String_2338 =
                            def_var_String_2336.substringAfter(def_var_String_2340)
                    } else if (def_var_String_2338.endsWith(def_var_String_2337)) {
                        def_var_String_2338 = def_var_String_2339.removeSuffix(def_var_String_2336)
                    } else if (def_var_String_2340.startsWith(def_var_String_2339)) {
                        def_var_String_2338 = def_var_String_2340.removeSuffix("metamorphosing")
                    } else if (def_var_String_2336.startsWith(def_var_String_2337)) {
                        def_var_String_2338 = def_var_String_2339.substringBeforeLast("penes")
                    } else if (def_var_String_2339.startsWith(def_var_String_2336)) {
                        def_var_String_2338 = "masais".commonPrefixWith("erogenesis")
                    } else if (def_var_String_2337.equals(def_var_String_2336)) {
                        def_var_String_2338 = "quadruplicature".substringAfter("lace")
                    } else if (def_var_String_2339.endsWith(def_var_String_2338)) {
                        def_var_String_2338 = def_var_String_2340.removeSuffix("realizers")
                    } else if (def_var_String_2336.equals(def_var_String_2340)) {
                        def_var_String_2338 = def_var_String_2340.substringBeforeLast("messe")
                    } else if (def_var_String_2337.endsWith(def_var_String_2339)) {
                        def_var_String_2338 = "corebox".removeSurrounding("subinfer")
                    } else if (def_var_String_2340.contains(def_var_String_2337)) {
                        def_var_String_2338 = "altheas".substringBefore("stickpins")
                    } else if (def_var_String_2338.equals(def_var_String_2339)) {
                        def_var_String_2338 = def_var_String_2337.commonPrefixWith("overdefined")
                    } else if (def_var_String_2338.endsWith(def_var_String_2337)) {
                        def_var_String_2338 =
                            def_var_String_2338.substringBeforeLast(def_var_String_2337)
                    } else if (def_var_String_2339.equals(def_var_String_2338)) {
                        def_var_String_2338 = def_var_String_2338.removeSuffix("taxidriver")
                    } else if (def_var_String_2340.equals(def_var_String_2339)) {
                        def_var_String_2338 = def_var_String_2336.removePrefix("untented")
                    } else if (def_var_String_2340.equals(def_var_String_2339)) {
                        def_var_String_2338 = "carcharhinus".commonSuffixWith("wingpiece")
                    } else if (def_var_String_2339.equals(def_var_String_2340)) {
                        def_var_String_2338 = "surmountable".commonSuffixWith("acquire")
                    } else if (def_var_String_2338.endsWith(def_var_String_2339)) {
                        def_var_String_2338 =
                            def_var_String_2336.substringBefore(def_var_String_2337)
                    } else if (def_var_String_2338.contains(def_var_String_2339)) {
                        def_var_String_2338 =
                            def_var_String_2339.removeSurrounding(def_var_String_2337)
                    } else {
                        def_var_String_2338 = "slipcovers".commonSuffixWith(def_var_String_2336)
                    }
                }
//$ def_var_String_2338

                goBasement()
            }
        }
    }

    override fun finishActivity() {
        var def_var_Long_2341: Long = System.currentTimeMillis()
        var def_var_Long_2342: Long = def_var_Long_2341 * 11
        var def_var_Long_2343: Long = def_var_Long_2342 and 12
        var def_var_Long_2344: Long = def_var_Long_2342 / 17
        var def_var_Long_2345: Long = def_var_Long_2342 / 20
        var def_var_Long_2346: Long = def_var_Long_2345 or 8
        var def_var_Long_2347: Long = def_var_Long_2346 or 3
        var def_var_Long_2348: Long = def_var_Long_2342 and 7
        var def_var_Long_2349: Long = def_var_Long_2346 - 9
        def_var_Long_2345 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_2345 >= def_var_Long_2341) {
                def_var_Long_2345 = def_var_Long_2348 xor def_var_Long_2347
            } else if (def_var_Long_2345 != def_var_Long_2347) {
                def_var_Long_2345 = def_var_Long_2346 + 6
            } else if (def_var_Long_2343 != def_var_Long_2349) {
                def_var_Long_2345 = def_var_Long_2344 and 15
            } else if (def_var_Long_2345 == def_var_Long_2343) {
                def_var_Long_2345 = def_var_Long_2347 + def_var_Long_2343
            } else if (170.toLong() < def_var_Long_2344) {
                def_var_Long_2345 = 443 or 1
            } else if (def_var_Long_2348 >= def_var_Long_2349) {
                def_var_Long_2345 = def_var_Long_2349 and 8
            } else if (def_var_Long_2345 >= def_var_Long_2343) {
                def_var_Long_2345 = def_var_Long_2345 % def_var_Long_2343
            } else if (def_var_Long_2345 == def_var_Long_2343) {
                def_var_Long_2345 = def_var_Long_2341 or def_var_Long_2349
            } else if (899.toLong() >= def_var_Long_2343) {
                def_var_Long_2345 = 985 xor 15
            } else if (def_var_Long_2349 <= def_var_Long_2342) {
                def_var_Long_2345 = def_var_Long_2345 or 26
            } else if (def_var_Long_2345 != def_var_Long_2343) {
                def_var_Long_2345 = def_var_Long_2347 % def_var_Long_2341
            } else if (def_var_Long_2345 >= def_var_Long_2343) {
                def_var_Long_2345 = def_var_Long_2344 xor 21
            } else if (def_var_Long_2349 != def_var_Long_2345) {
                def_var_Long_2345 = def_var_Long_2342 % 22
            } else if (688.toLong() < def_var_Long_2344) {
                def_var_Long_2345 = 599 - 9
            } else if (215.toLong() != def_var_Long_2348) {
                def_var_Long_2345 = 94 xor 4
            } else {
                def_var_Long_2345 = 495.toLong() + def_var_Long_2347
            }
        }
//$ def_var_Long_2345.toInt()

        super.finishActivity()
        finishCall?.invoke()
        finishCall = null
    }

    override fun onInterstitialAdShow(p0: ATAdInfo?) {
        var def_var_Long_2350: Long = System.currentTimeMillis()
        var def_var_Long_2351: Long = def_var_Long_2350 % 21
        var def_var_Long_2352: Long = def_var_Long_2351 * 31
        var def_var_Long_2353: Long = def_var_Long_2351 % 27
        var def_var_Long_2354: Long = def_var_Long_2353 xor 5
        var def_var_Long_2355: Long = def_var_Long_2351 and 24
        var def_var_Long_2356: Long = def_var_Long_2354 / 5
        var def_var_Long_2357: Long = def_var_Long_2356 % 12
        var def_var_Long_2358: Long = def_var_Long_2356 xor 12
        def_var_Long_2351 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_2351 != def_var_Long_2357) {
                def_var_Long_2351 = def_var_Long_2358 % def_var_Long_2353
            } else if (153.toLong() < def_var_Long_2350) {
                def_var_Long_2351 = 183 or 5
            } else if (524.toLong() <= def_var_Long_2358) {
                def_var_Long_2351 = 428 / 4
            } else if (def_var_Long_2352 != def_var_Long_2351) {
                def_var_Long_2351 = def_var_Long_2356 % 22
            } else if (def_var_Long_2351 >= def_var_Long_2352) {
                def_var_Long_2351 = def_var_Long_2352 or def_var_Long_2354
            } else if (def_var_Long_2351 >= def_var_Long_2354) {
                def_var_Long_2351 = def_var_Long_2352 - def_var_Long_2355
            } else if (def_var_Long_2353 >= def_var_Long_2356) {
                def_var_Long_2351 = def_var_Long_2351 and 15
            } else if (def_var_Long_2351 <= def_var_Long_2353) {
                def_var_Long_2351 = def_var_Long_2357 and def_var_Long_2355
            } else if (53.toLong() < def_var_Long_2357) {
                def_var_Long_2351 = 450 % 26
            } else if (def_var_Long_2351 >= def_var_Long_2354) {
                def_var_Long_2351 = def_var_Long_2351 - def_var_Long_2350
            } else if (def_var_Long_2351 != def_var_Long_2355) {
                def_var_Long_2351 = def_var_Long_2350 xor def_var_Long_2357
            } else if (713.toLong() < def_var_Long_2350) {
                def_var_Long_2351 = 481 and 18
            } else if (74.toLong() > def_var_Long_2356) {
                def_var_Long_2351 = 664 xor 5
            } else {
                def_var_Long_2351 = 190.toLong() and def_var_Long_2358
            }
        }
//$ def_var_Long_2351.toInt()

        super.onInterstitialAdShow(p0)
        p0?.apply {
            var def_var_String_2359: String = ""
            var def_var_Double_2360: Double = Math.random()
            if ((999.0 - getwormil()) > 0.0) {
                setincremented(getwormil() + def_var_Double_2360)
                if ((267.0 - def_var_Double_2360) > 0.0) {
                    setrigsmaal(Math.random() > 0.5)
                    def_var_String_2359 = Math.random().toString()
                } else {
                    setrigsmaal(Math.random() > 0.5)
                    def_var_String_2359 = Math.random().toString()
                }
            } else if ((getdeviators() - 475) > 0) {
                def_var_Double_2360 = Math.random()
                if ((567.0 - def_var_Double_2360) > 0.0) {
                    def_var_Double_2360 = 180.toDouble()
                } else if ((19.0 - def_var_Double_2360) > 0.0) {
                    def_var_Double_2360 = 722.toDouble()
                } else if ((423.0 - def_var_Double_2360) > 0.0) {
                    def_var_Double_2360 = 486.toDouble()
                } else if ((824.0 - def_var_Double_2360) > 0.0) {
                    def_var_Double_2360 = 989.toDouble()
                } else {
                    def_var_Double_2360 = 828.toDouble()
                }
                setincremented(def_var_Double_2360)
                def_var_String_2359 = Math.random().toString()
            }
            setconfuser(def_var_String_2359)

            val adjustAdRevenue = AdjustAdRevenue(AdjustConfig.AD_REVENUE_SOURCE_PUBLISHER)
            //
            adjustAdRevenue.setRevenue(publisherRevenue, currency)
            //可选配置
            adjustAdRevenue.setAdRevenueUnit(adsourceId)
            adjustAdRevenue.setAdRevenueNetwork(networkFirmId.toString())

            adjustAdRevenue.setAdRevenuePlacement(placementId)
            //发送收益数据
            Adjust.trackAdRevenue(adjustAdRevenue)
        }
    }
}