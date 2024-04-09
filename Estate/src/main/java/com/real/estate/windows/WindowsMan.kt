//Already processed
package com.real.estate.windows

import android.content.Context
import android.os.Build
import android.webkit.WebSettings
import com.android.installreferrer.api.InstallReferrerClient
import com.android.installreferrer.api.InstallReferrerStateListener
import com.android.installreferrer.api.ReferrerDetails
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.FloorImpl
import com.real.estate.IS_TEST
import com.real.estate.attic.AtticNetHelper
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

import org.json.JSONObject

// init code
fun parsifal(def_var_Int_6780: Int): Int {
    var def_var_Int_6781: Int = def_var_Int_6780 - 30
    var def_var_Int_6782: Int = 6
    var def_var_Int_6783: Int = 31
    var def_var_Int_6784: Int = 8
    var def_var_Int_6785: Int = 25
    var def_var_Int_6786: Int = 1
    var def_var_Int_6787: Int = 25
    var def_var_Int_6788: Int = 25
    var def_var_Int_6789: Int = 2
    var def_var_Int_6790: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6790 = def_var_Int_6784 / 25
        def_var_Int_6790 = 177 and 31
        def_var_Int_6790 = 462 and 16
        def_var_Int_6790 = def_var_Int_6781 - def_var_Int_6783
        def_var_Int_6790 = def_var_Int_6784 - def_var_Int_6788
        def_var_Int_6790 = def_var_Int_6789 + 9
        def_var_Int_6790 = def_var_Int_6787 % 17
        def_var_Int_6790 = 748 % 25
        def_var_Int_6790 = def_var_Int_6787 * def_var_Int_6788
        def_var_Int_6790 = 966 - 2
    }
    return def_var_Int_6790
}

fun nonjurancy(def_var_Int_6791: Int): Int {
    var def_var_Int_6792: Int = def_var_Int_6791 and 27
    var def_var_Int_6793: Int = 21
    var def_var_Int_6794: Int = 23
    var def_var_Int_6795: Int = 6
    var def_var_Int_6796: Int = 6
    var def_var_Int_6797: Int = 17
    var def_var_Int_6798: Int = 16
    var def_var_Int_6799: Int = 7
    var def_var_Int_6800: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6800 = def_var_Int_6799 % def_var_Int_6795
        def_var_Int_6800 = 598 / 16
        def_var_Int_6800 = 338 xor 20
        def_var_Int_6800 = def_var_Int_6797 - def_var_Int_6794
        def_var_Int_6800 = 688 / 25
        def_var_Int_6800 = def_var_Int_6798 / def_var_Int_6797
        def_var_Int_6800 = def_var_Int_6792 * def_var_Int_6795
        def_var_Int_6800 = def_var_Int_6796 - 24
        def_var_Int_6800 = 598 / 28
        def_var_Int_6800 = def_var_Int_6795 xor def_var_Int_6792
        def_var_Int_6800 = 55 - 30
        def_var_Int_6800 = def_var_Int_6795 % def_var_Int_6792
        def_var_Int_6800 = def_var_Int_6792 - def_var_Int_6798
        def_var_Int_6800 = def_var_Int_6795 and 8
        def_var_Int_6800 = def_var_Int_6798 and 12
        def_var_Int_6800 = def_var_Int_6795 and def_var_Int_6797
        def_var_Int_6800 = 317 - 19
    }
    return def_var_Int_6800
}

fun neopagan(def_var_Int_6801: Int): Int {
    var def_var_Long_6802: Long = def_var_Int_6801.toLong()
    var def_var_Long_6803: Long = System.currentTimeMillis()
    var def_var_Long_6804: Long = System.currentTimeMillis()
    var def_var_Long_6805: Long = System.currentTimeMillis()
    var def_var_Long_6806: Long = System.currentTimeMillis()
    var def_var_Long_6807: Long = System.currentTimeMillis()
    var def_var_Long_6808: Long = System.currentTimeMillis()
    var def_var_Long_6809: Long = System.currentTimeMillis()
    var def_var_Long_6810: Long = System.currentTimeMillis()
    var def_var_Long_6811: Long = System.currentTimeMillis()
    def_var_Long_6811 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_6811 <= def_var_Long_6809) {
            def_var_Long_6811 = def_var_Long_6807 / def_var_Long_6803
        } else if (def_var_Long_6803 != def_var_Long_6805) {
            def_var_Long_6811 = def_var_Long_6810 and 15
        } else if (29.toLong() != def_var_Long_6809) {
            def_var_Long_6811 = 339 - 23
        } else if (def_var_Long_6811 >= def_var_Long_6810) {
            def_var_Long_6811 = def_var_Long_6804 xor def_var_Long_6802
        } else if (628.toLong() > def_var_Long_6802) {
            def_var_Long_6811 = 291 and 21
        } else if (25.toLong() >= def_var_Long_6808) {
            def_var_Long_6811 = 933 - 2
        } else if (947.toLong() >= def_var_Long_6802) {
            def_var_Long_6811 = 473 and 5
        } else if (def_var_Long_6807 != def_var_Long_6802) {
            def_var_Long_6811 = def_var_Long_6805 / 18
        } else if (def_var_Long_6810 != def_var_Long_6805) {
            def_var_Long_6811 = def_var_Long_6806 - 13
        } else if (def_var_Long_6805 >= def_var_Long_6804) {
            def_var_Long_6811 = def_var_Long_6805 and 3
        } else if (def_var_Long_6804 < def_var_Long_6803) {
            def_var_Long_6811 = def_var_Long_6811 + 26
        } else if (123.toLong() != def_var_Long_6809) {
            def_var_Long_6811 = 720 % 29
        } else if (207.toLong() == def_var_Long_6809) {
            def_var_Long_6811 = 597 and 13
        } else if (791.toLong() == def_var_Long_6808) {
            def_var_Long_6811 = 577 or 6
        } else if (787.toLong() > def_var_Long_6802) {
            def_var_Long_6811 = 532 xor 30
        } else if (def_var_Long_6811 > def_var_Long_6803) {
            def_var_Long_6811 = def_var_Long_6804 xor def_var_Long_6808
        } else if (def_var_Long_6811 == def_var_Long_6804) {
            def_var_Long_6811 = def_var_Long_6809 or def_var_Long_6811
        } else {
            def_var_Long_6811 = 727.toLong() + def_var_Long_6805
        }
    }
    return def_var_Long_6811.toInt()
}

fun gasometer(def_var_Int_6812: Int): Int {
    var def_var_Long_6813: Long = def_var_Int_6812.toLong()
    var def_var_Long_6814: Long = System.currentTimeMillis()
    var def_var_Long_6815: Long = System.currentTimeMillis()
    var def_var_Long_6816: Long = System.currentTimeMillis()
    var def_var_Long_6817: Long = System.currentTimeMillis()
    var def_var_Long_6818: Long = System.currentTimeMillis()
    def_var_Long_6814 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_6814 == def_var_Long_6813) {
            def_var_Long_6814 = def_var_Long_6815 xor def_var_Long_6813
        } else if (def_var_Long_6814 < def_var_Long_6817) {
            def_var_Long_6814 = def_var_Long_6814 * 25
        } else if (def_var_Long_6814 >= def_var_Long_6818) {
            def_var_Long_6814 = def_var_Long_6817 - 24
        } else if (600.toLong() >= def_var_Long_6817) {
            def_var_Long_6814 = 255 % 29
        } else if (def_var_Long_6814 == def_var_Long_6813) {
            def_var_Long_6814 = def_var_Long_6815 % def_var_Long_6813
        } else if (def_var_Long_6815 == def_var_Long_6816) {
            def_var_Long_6814 = def_var_Long_6813 - 11
        } else if (def_var_Long_6814 <= def_var_Long_6813) {
            def_var_Long_6814 = def_var_Long_6817 and 27
        } else if (def_var_Long_6814 > def_var_Long_6818) {
            def_var_Long_6814 = def_var_Long_6813 or def_var_Long_6814
        } else if (812.toLong() <= def_var_Long_6818) {
            def_var_Long_6814 = 947 xor 23
        } else if (def_var_Long_6814 < def_var_Long_6813) {
            def_var_Long_6814 = def_var_Long_6816 or 23
        } else if (def_var_Long_6814 == def_var_Long_6813) {
            def_var_Long_6814 = def_var_Long_6815 and def_var_Long_6817
        } else if (def_var_Long_6814 != def_var_Long_6818) {
            def_var_Long_6814 = def_var_Long_6813 xor 29
        } else if (def_var_Long_6814 == def_var_Long_6816) {
            def_var_Long_6814 = def_var_Long_6817 and def_var_Long_6818
        } else if (875.toLong() != def_var_Long_6816) {
            def_var_Long_6814 = 269 * 14
        } else if (def_var_Long_6814 < def_var_Long_6818) {
            def_var_Long_6814 = def_var_Long_6815 + def_var_Long_6817
        } else if (131.toLong() < def_var_Long_6817) {
            def_var_Long_6814 = 750 xor 23
        } else if (def_var_Long_6814 == def_var_Long_6815) {
            def_var_Long_6814 = def_var_Long_6816 and def_var_Long_6815
        } else if (def_var_Long_6814 < def_var_Long_6813) {
            def_var_Long_6814 = def_var_Long_6813 xor def_var_Long_6814
        } else {
            def_var_Long_6814 = 12.toLong() * def_var_Long_6815
        }
    }
    return def_var_Long_6814.toInt()
}

fun pharmacopeias(def_var_Int_6819: Int): Int {
    var def_var_Int_6820: Int = def_var_Int_6819 + 5
    var def_var_Int_6821: Int = 11
    var def_var_Int_6822: Int = 26
    var def_var_Int_6823: Int = 16
    var def_var_Int_6824: Int = 23
    var def_var_Int_6825: Int = 4
    var def_var_Int_6826: Int = 11
    var def_var_Int_6827: Int = 16
    var def_var_Int_6828: Int = 20
    var def_var_Int_6829: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6829 = def_var_Int_6823 / 19
        def_var_Int_6829 = 545 and 25
        def_var_Int_6829 = 239 + 10
        def_var_Int_6829 = 774 % 30
        def_var_Int_6829 = 44 or 17
        def_var_Int_6829 = def_var_Int_6824 * 22
        def_var_Int_6829 = 942 / 11
        def_var_Int_6829 = def_var_Int_6821 - 6
        def_var_Int_6829 = 115 or 26
        def_var_Int_6829 = def_var_Int_6828 + 28
        def_var_Int_6829 = def_var_Int_6822 * 8
    }
    return def_var_Int_6829
}

fun ascitical(def_var_Int_6830: Int): Int {
    var def_var_String_6831: String = "relishable"
    var def_var_String_6832: String = "abet"
    var def_var_String_6833: String = "bootblacks"
    var def_var_String_6834: String = "larksomes"
    var def_var_String_6835: String = "ogreisms"
    def_var_String_6832 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_6832.startsWith(def_var_String_6835)) {
            def_var_String_6832 = def_var_String_6835.substringAfter(def_var_String_6834)
        } else if (def_var_String_6833.contains(def_var_String_6834)) {
            def_var_String_6832 = "claymore".substringAfterLast("adoxography")
        } else if (def_var_String_6834.equals(def_var_String_6835)) {
            def_var_String_6832 = "halfpace".substringBefore("conditoria")
        } else if (def_var_String_6832.equals(def_var_String_6831)) {
            def_var_String_6832 = def_var_String_6832.removeSurrounding("sutoria")
        } else if (def_var_String_6832.startsWith(def_var_String_6835)) {
            def_var_String_6832 = def_var_String_6835.commonPrefixWith(def_var_String_6834)
        } else if (def_var_String_6832.equals(def_var_String_6831)) {
            def_var_String_6832 = def_var_String_6833.removePrefix(def_var_String_6834)
        } else if (def_var_String_6832.endsWith(def_var_String_6831)) {
            def_var_String_6832 = def_var_String_6834.commonPrefixWith(def_var_String_6831)
        } else if (def_var_String_6832.startsWith(def_var_String_6833)) {
            def_var_String_6832 = def_var_String_6832.substringAfterLast(def_var_String_6833)
        } else if (def_var_String_6834.endsWith(def_var_String_6831)) {
            def_var_String_6832 = "diphycercal".commonSuffixWith("misbilled")
        } else if (def_var_String_6835.contains(def_var_String_6833)) {
            def_var_String_6832 = "humoristic".substringBefore("opacifier")
        } else if (def_var_String_6834.equals(def_var_String_6834)) {
            def_var_String_6832 = "slurban".substringBeforeLast("hyrcan")
        } else if (def_var_String_6833.endsWith(def_var_String_6833)) {
            def_var_String_6832 = "incornished".removeSuffix("preexpeditionary")
        } else if (def_var_String_6832.contains(def_var_String_6833)) {
            def_var_String_6832 = def_var_String_6832.removePrefix(def_var_String_6834)
        } else if (def_var_String_6832.endsWith(def_var_String_6834)) {
            def_var_String_6832 = def_var_String_6832.removeSuffix("inlapidate")
        } else {
            def_var_String_6832 = "ascolichenes".removeSuffix(def_var_String_6834)
        }
    }
//$ def_var_String_6832

    if (def_var_String_6832.equals("hydrochoerus")) {
        return def_var_Int_6830
    }
    return -1
}

fun phoenicize(def_var_Int_6836: Int): Int {
    var def_var_Long_6837: Long = def_var_Int_6836.toLong()
    var def_var_Long_6838: Long = System.currentTimeMillis()
    var def_var_Long_6839: Long = System.currentTimeMillis()
    var def_var_Long_6840: Long = System.currentTimeMillis()
    var def_var_Long_6841: Long = System.currentTimeMillis()
    var def_var_Long_6842: Long = System.currentTimeMillis()
    var def_var_Long_6843: Long = System.currentTimeMillis()
    var def_var_Long_6844: Long = System.currentTimeMillis()
    var def_var_Long_6845: Long = System.currentTimeMillis()
    def_var_Long_6843 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_6843 != def_var_Long_6841) {
            def_var_Long_6843 = def_var_Long_6840 / def_var_Long_6838
        } else if (def_var_Long_6843 != def_var_Long_6837) {
            def_var_Long_6843 = def_var_Long_6845 * def_var_Long_6837
        } else if (def_var_Long_6843 > def_var_Long_6838) {
            def_var_Long_6843 = def_var_Long_6839 * def_var_Long_6844
        } else if (353.toLong() == def_var_Long_6840) {
            def_var_Long_6843 = 621 / 22
        } else if (def_var_Long_6843 > def_var_Long_6839) {
            def_var_Long_6843 = def_var_Long_6839 or def_var_Long_6841
        } else if (def_var_Long_6843 == def_var_Long_6838) {
            def_var_Long_6843 = def_var_Long_6842 or def_var_Long_6845
        } else if (359.toLong() > def_var_Long_6838) {
            def_var_Long_6843 = 370 or 18
        } else if (def_var_Long_6843 < def_var_Long_6840) {
            def_var_Long_6843 = def_var_Long_6844 / def_var_Long_6839
        } else if (def_var_Long_6843 <= def_var_Long_6841) {
            def_var_Long_6843 = def_var_Long_6839 and def_var_Long_6840
        } else if (783.toLong() > def_var_Long_6840) {
            def_var_Long_6843 = 40 % 5
        } else if (def_var_Long_6843 >= def_var_Long_6837) {
            def_var_Long_6843 = def_var_Long_6839 + def_var_Long_6840
        } else if (def_var_Long_6843 != def_var_Long_6837) {
            def_var_Long_6843 = def_var_Long_6844 - def_var_Long_6840
        } else if (def_var_Long_6839 <= def_var_Long_6842) {
            def_var_Long_6843 = def_var_Long_6843 * 7
        } else if (def_var_Long_6839 <= def_var_Long_6840) {
            def_var_Long_6843 = def_var_Long_6837 / 14
        } else if (def_var_Long_6844 > def_var_Long_6842) {
            def_var_Long_6843 = def_var_Long_6842 and 3
        } else {
            def_var_Long_6843 = 41.toLong() + def_var_Long_6839
        }
    }
    return def_var_Long_6843.toInt()
}

fun blacktopping(def_var_Int_6846: Int): Int {
    var def_var_Int_6847: Int = def_var_Int_6846 * 14
    var def_var_Int_6848: Int = 11
    var def_var_Int_6849: Int = 27
    var def_var_Int_6850: Int = 27
    var def_var_Int_6851: Int = 1
    var def_var_Int_6852: Int = 2
    var def_var_Int_6853: Int = 6
    var def_var_Int_6854: Int = 18
    var def_var_Int_6855: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6855 = 598 * 31
        def_var_Int_6855 = def_var_Int_6853 - def_var_Int_6847
        def_var_Int_6855 = 749 / 29
        def_var_Int_6855 = 356 + 5
        def_var_Int_6855 = 857 % 23
        def_var_Int_6855 = def_var_Int_6850 and 25
        def_var_Int_6855 = def_var_Int_6847 + def_var_Int_6851
        def_var_Int_6855 = def_var_Int_6849 xor 9
        def_var_Int_6855 = def_var_Int_6850 or def_var_Int_6848
        def_var_Int_6855 = def_var_Int_6848 * def_var_Int_6849
        def_var_Int_6855 = 765 or 27
        def_var_Int_6855 = 377 xor 24
    }
    return def_var_Int_6855
}

fun thumbscrews(def_var_Int_6856: Int): Int {
    var def_var_Long_6857: Long = def_var_Int_6856.toLong()
    var def_var_Long_6858: Long = System.currentTimeMillis()
    var def_var_Long_6859: Long = System.currentTimeMillis()
    var def_var_Long_6860: Long = System.currentTimeMillis()
    var def_var_Long_6861: Long = System.currentTimeMillis()
    var def_var_Long_6862: Long = System.currentTimeMillis()
    var def_var_Long_6863: Long = System.currentTimeMillis()
    var def_var_Long_6864: Long = System.currentTimeMillis()
    def_var_Long_6862 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_6862 == def_var_Long_6857) {
            def_var_Long_6862 = def_var_Long_6858 xor def_var_Long_6860
        } else if (599.toLong() < def_var_Long_6860) {
            def_var_Long_6862 = 69 xor 2
        } else if (501.toLong() > def_var_Long_6859) {
            def_var_Long_6862 = 191 % 24
        } else if (def_var_Long_6862 <= def_var_Long_6861) {
            def_var_Long_6862 = def_var_Long_6857 / def_var_Long_6859
        } else if (def_var_Long_6862 != def_var_Long_6859) {
            def_var_Long_6862 = def_var_Long_6857 / def_var_Long_6863
        } else if (439.toLong() <= def_var_Long_6861) {
            def_var_Long_6862 = 152 - 5
        } else if (104.toLong() <= def_var_Long_6858) {
            def_var_Long_6862 = 586 + 29
        } else if (280.toLong() >= def_var_Long_6864) {
            def_var_Long_6862 = 38 / 12
        } else if (def_var_Long_6862 != def_var_Long_6864) {
            def_var_Long_6862 = def_var_Long_6862 and def_var_Long_6864
        } else if (def_var_Long_6861 != def_var_Long_6864) {
            def_var_Long_6862 = def_var_Long_6858 xor 28
        } else if (def_var_Long_6862 > def_var_Long_6857) {
            def_var_Long_6862 = def_var_Long_6864 and def_var_Long_6857
        } else if (def_var_Long_6863 > def_var_Long_6860) {
            def_var_Long_6862 = def_var_Long_6863 * 30
        } else if (384.toLong() == def_var_Long_6864) {
            def_var_Long_6862 = 728 xor 11
        } else if (def_var_Long_6864 >= def_var_Long_6857) {
            def_var_Long_6862 = def_var_Long_6864 or 15
        } else if (def_var_Long_6862 < def_var_Long_6858) {
            def_var_Long_6862 = def_var_Long_6858 / def_var_Long_6860
        } else if (879.toLong() >= def_var_Long_6857) {
            def_var_Long_6862 = 65 and 12
        } else {
            def_var_Long_6862 = 716.toLong() xor def_var_Long_6857
        }
    }
    return def_var_Long_6862.toInt()
}

fun undiscomfited(def_var_Int_6865: Int): Int {
    var def_var_String_6866: String = "bondholder"
    var def_var_String_6867: String = "unscaly"
    var def_var_String_6868: String = "disappendancy"
    var def_var_String_6869: String = "odontolcae"
    var def_var_String_6870: String = "adenosine"
    var def_var_String_6871: String = "diminutively"
    var def_var_String_6872: String = "treadle"
    var def_var_String_6873: String = "trope"
    var def_var_String_6874: String = "yauped"
    def_var_String_6867 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_6867.contains(def_var_String_6869)) {
            def_var_String_6867 = def_var_String_6869.substringAfter(def_var_String_6870)
        } else if (def_var_String_6873.endsWith(def_var_String_6869)) {
            def_var_String_6867 = def_var_String_6872.removeSuffix("unionid")
        } else if (def_var_String_6871.contains(def_var_String_6869)) {
            def_var_String_6867 = "rostella".removePrefix("habutae")
        } else if (def_var_String_6867.equals(def_var_String_6874)) {
            def_var_String_6867 = def_var_String_6871.removePrefix(def_var_String_6872)
        } else if (def_var_String_6869.equals(def_var_String_6869)) {
            def_var_String_6867 = "mediodorsally".substringAfter("tickbean")
        } else if (def_var_String_6867.equals(def_var_String_6873)) {
            def_var_String_6867 = def_var_String_6873.commonSuffixWith(def_var_String_6874)
        } else if (def_var_String_6867.equals(def_var_String_6870)) {
            def_var_String_6867 = def_var_String_6873.commonSuffixWith(def_var_String_6869)
        } else if (def_var_String_6872.equals(def_var_String_6868)) {
            def_var_String_6867 = def_var_String_6871.substringBefore("dangles")
        } else if (def_var_String_6874.equals(def_var_String_6871)) {
            def_var_String_6867 = def_var_String_6871.removeSurrounding("involucrate")
        } else if (def_var_String_6867.contains(def_var_String_6872)) {
            def_var_String_6867 = def_var_String_6873.commonPrefixWith(def_var_String_6868)
        } else if (def_var_String_6873.startsWith(def_var_String_6872)) {
            def_var_String_6867 = "undivorcedness".commonPrefixWith("cytioderm")
        } else if (def_var_String_6867.equals(def_var_String_6871)) {
            def_var_String_6867 = def_var_String_6872.commonSuffixWith(def_var_String_6867)
        } else if (def_var_String_6870.equals(def_var_String_6868)) {
            def_var_String_6867 = def_var_String_6872.removeSuffix("thereaway")
        } else if (def_var_String_6868.startsWith(def_var_String_6869)) {
            def_var_String_6867 = def_var_String_6874.removeSurrounding("strontium")
        } else if (def_var_String_6874.startsWith(def_var_String_6872)) {
            def_var_String_6867 = def_var_String_6868.substringAfter("ejaculum")
        } else {
            def_var_String_6867 = "wallow".commonPrefixWith(def_var_String_6869)
        }
    }
//$ def_var_String_6867

    if (def_var_String_6867.equals("outbeam")) {
        return def_var_Int_6865
    }
    return -1
}

fun metaldehyde(def_var_Int_6875: Int): Int {
    var def_var_Int_6876: Int = def_var_Int_6875 * 26
    var def_var_Int_6877: Int = 25
    var def_var_Int_6878: Int = 20
    var def_var_Int_6879: Int = 13
    var def_var_Int_6880: Int = 17
    var def_var_Int_6881: Int = 22
    var def_var_Int_6882: Int = 10
    var def_var_Int_6883: Int = 20
    var def_var_Int_6884: Int = 25
    var def_var_Int_6885: Int = 29
    var def_var_Int_6886: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6886 = def_var_Int_6883 + 21
        def_var_Int_6886 = def_var_Int_6880 - 31
        def_var_Int_6886 = 143 % 29
        def_var_Int_6886 = def_var_Int_6879 - def_var_Int_6881
        def_var_Int_6886 = 1 / 4
        def_var_Int_6886 = def_var_Int_6884 - def_var_Int_6879
        def_var_Int_6886 = def_var_Int_6879 * 22
        def_var_Int_6886 = def_var_Int_6877 xor 7
        def_var_Int_6886 = def_var_Int_6884 or 8
        def_var_Int_6886 = def_var_Int_6883 or def_var_Int_6884
        def_var_Int_6886 = 717 and 14
        def_var_Int_6886 = 364 * 24
        def_var_Int_6886 = def_var_Int_6876 % def_var_Int_6883
        def_var_Int_6886 = 717 or 16
        def_var_Int_6886 = 994 + 16
        def_var_Int_6886 = def_var_Int_6885 - def_var_Int_6877
    }
    return def_var_Int_6886
}

fun parlous(def_var_Int_6887: Int): Int {
    var def_var_String_6888: String = "interfiltrate"
    var def_var_String_6889: String = "nonfragileness"
    var def_var_String_6890: String = "mesepisternum"
    var def_var_String_6891: String = "slatterns"
    var def_var_String_6892: String = "samaritanism"
    var def_var_String_6893: String = "dacryd"
    var def_var_String_6894: String = "trypetidae"
    var def_var_String_6895: String = "serbians"
    def_var_String_6892 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_6892.endsWith(def_var_String_6894)) {
            def_var_String_6892 = def_var_String_6890.commonPrefixWith(def_var_String_6889)
        } else if (def_var_String_6890.equals(def_var_String_6888)) {
            def_var_String_6892 = def_var_String_6889.substringBeforeLast("stude")
        } else if (def_var_String_6888.equals(def_var_String_6894)) {
            def_var_String_6892 = def_var_String_6889.commonPrefixWith("semifeudalism")
        } else if (def_var_String_6891.contains(def_var_String_6894)) {
            def_var_String_6892 = "dysphemia".commonSuffixWith("ambari")
        } else if (def_var_String_6895.contains(def_var_String_6888)) {
            def_var_String_6892 = def_var_String_6893.commonPrefixWith("wiremen")
        } else if (def_var_String_6892.contains(def_var_String_6891)) {
            def_var_String_6892 = def_var_String_6894.removePrefix(def_var_String_6889)
        } else if (def_var_String_6889.startsWith(def_var_String_6890)) {
            def_var_String_6892 = def_var_String_6895.removePrefix("peneseismic")
        } else if (def_var_String_6889.contains(def_var_String_6893)) {
            def_var_String_6892 = "headframe".removeSuffix("unscarred")
        } else if (def_var_String_6890.endsWith(def_var_String_6891)) {
            def_var_String_6892 = "tuguria".removePrefix("copaljocote")
        } else if (def_var_String_6889.contains(def_var_String_6890)) {
            def_var_String_6892 = "banakite".substringAfterLast("postjugular")
        } else if (def_var_String_6892.contains(def_var_String_6893)) {
            def_var_String_6892 = def_var_String_6888.substringBeforeLast(def_var_String_6890)
        } else if (def_var_String_6894.endsWith(def_var_String_6895)) {
            def_var_String_6892 = def_var_String_6889.substringAfterLast("agy")
        } else {
            def_var_String_6892 = "bodes".commonPrefixWith(def_var_String_6891)
        }
    }
//$ def_var_String_6892

    if (def_var_String_6892.startsWith("aceanthrenequinone")) {
        return def_var_Int_6887
    }
    return -1
}

fun sleekier(def_var_Int_6896: Int): Int {
    var def_var_String_6897: String = "bakalei"
    var def_var_String_6898: String = "electrostenolysis"
    var def_var_String_6899: String = "oilberry"
    var def_var_String_6900: String = "overlaudation"
    var def_var_String_6901: String = "planigram"
    var def_var_String_6902: String = "smorzato"
    def_var_String_6897 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_6897.equals(def_var_String_6900)) {
            def_var_String_6897 = def_var_String_6902.substringAfterLast(def_var_String_6901)
        } else if (def_var_String_6901.equals(def_var_String_6897)) {
            def_var_String_6897 = def_var_String_6900.substringAfterLast("uncommonest")
        } else if (def_var_String_6899.contains(def_var_String_6900)) {
            def_var_String_6897 = def_var_String_6897.commonPrefixWith("resound")
        } else if (def_var_String_6901.contains(def_var_String_6898)) {
            def_var_String_6897 = "cerer".substringBeforeLast("microbicidal")
        } else if (def_var_String_6897.endsWith(def_var_String_6899)) {
            def_var_String_6897 = def_var_String_6897.removePrefix(def_var_String_6900)
        } else if (def_var_String_6902.contains(def_var_String_6902)) {
            def_var_String_6897 = "peridesmic".removePrefix("emulsor")
        } else if (def_var_String_6902.equals(def_var_String_6898)) {
            def_var_String_6897 = "hemipteroid".substringAfterLast("screeny")
        } else if (def_var_String_6898.equals(def_var_String_6901)) {
            def_var_String_6897 = "underconsumed".removePrefix("latened")
        } else if (def_var_String_6897.startsWith(def_var_String_6902)) {
            def_var_String_6897 = def_var_String_6900.commonPrefixWith(def_var_String_6898)
        } else if (def_var_String_6897.equals(def_var_String_6901)) {
            def_var_String_6897 = def_var_String_6898.substringBeforeLast(def_var_String_6901)
        } else if (def_var_String_6898.endsWith(def_var_String_6899)) {
            def_var_String_6897 = "paintier".substringBefore("boozes")
        } else {
            def_var_String_6897 = "outsail".substringAfterLast(def_var_String_6901)
        }
    }
//$ def_var_String_6897

    if (def_var_String_6897.equals("mercuric")) {
        return def_var_Int_6896
    }
    return -1
}

fun undespaired(def_var_Int_6903: Int): Int {
    var def_var_Int_6904: Int = def_var_Int_6903 % 28
    var def_var_Int_6905: Int = 14
    var def_var_Int_6906: Int = 1
    var def_var_Int_6907: Int = 23
    var def_var_Int_6908: Int = 25
    var def_var_Int_6909: Int = 22
    var def_var_Int_6910: Int = 14
    var def_var_Int_6911: Int = 11
    var def_var_Int_6912: Int = 2
    var def_var_Int_6913: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6913 = 585 % 26
        def_var_Int_6913 = def_var_Int_6904 xor 25
        def_var_Int_6913 = 662 or 25
        def_var_Int_6913 = 352 or 17
        def_var_Int_6913 = 828 + 19
        def_var_Int_6913 = def_var_Int_6905 / 13
        def_var_Int_6913 = def_var_Int_6908 xor def_var_Int_6911
        def_var_Int_6913 = def_var_Int_6910 - 20
        def_var_Int_6913 = def_var_Int_6907 - def_var_Int_6904
        def_var_Int_6913 = 399 - 10
        def_var_Int_6913 = def_var_Int_6904 xor 24
        def_var_Int_6913 = def_var_Int_6911 and def_var_Int_6905
        def_var_Int_6913 = def_var_Int_6908 * def_var_Int_6905
    }
    return def_var_Int_6913
}

fun stenopetalous(def_var_Int_6914: Int): Int {
    var def_var_Int_6915: Int = def_var_Int_6914 / 19
    var def_var_Int_6916: Int = 16
    var def_var_Int_6917: Int = 21
    var def_var_Int_6918: Int = 15
    var def_var_Int_6919: Int = 31
    var def_var_Int_6920: Int = 26
    var def_var_Int_6921: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6921 = def_var_Int_6915 * def_var_Int_6917
        def_var_Int_6921 = 234 or 26
        def_var_Int_6921 = 609 and 29
        def_var_Int_6921 = def_var_Int_6920 * 3
        def_var_Int_6921 = def_var_Int_6915 / 25
        def_var_Int_6921 = def_var_Int_6915 % def_var_Int_6917
        def_var_Int_6921 = def_var_Int_6918 % 12
        def_var_Int_6921 = def_var_Int_6919 * def_var_Int_6918
        def_var_Int_6921 = def_var_Int_6920 * 13
        def_var_Int_6921 = 796 and 11
        def_var_Int_6921 = def_var_Int_6916 / 2
        def_var_Int_6921 = 319 / 23
    }
    return def_var_Int_6921
}

fun welshry(def_var_Int_6922: Int): Int {//Function call
    var def_var_Int_6923: Int = 773
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_6923 = undiscomfited(def_var_Int_6923)
        def_var_Int_6923 = undiscomfited(486) % undespaired(def_var_Int_6922)
        def_var_Int_6923 = blacktopping(865)
        def_var_Int_6923 = pharmacopeias(650)
        def_var_Int_6923 = undespaired(147) * nonjurancy(def_var_Int_6922)
        def_var_Int_6923 = parlous(def_var_Int_6922)
        def_var_Int_6923 = undespaired(265) and blacktopping(def_var_Int_6922)
        def_var_Int_6923 = phoenicize(def_var_Int_6922)
        def_var_Int_6923 = metaldehyde(327)
        def_var_Int_6923 = undiscomfited(738)
        def_var_Int_6923 = metaldehyde(def_var_Int_6923)
        def_var_Int_6923 = blacktopping(962) xor metaldehyde(def_var_Int_6923)
        def_var_Int_6923 = neopagan(def_var_Int_6922)
        def_var_Int_6923 = thumbscrews(def_var_Int_6923)
        def_var_Int_6923 = gasometer(def_var_Int_6923)
    }
    return def_var_Int_6923
}

fun daedaleous(def_var_Int_6924: Int): Int {//Function call(fork)
    var def_var_Int_6925: Int = 714
    if (System.currentTimeMillis().toInt() == 0) {
        if (ascitical(def_var_Int_6925) < 317) {
            def_var_Int_6925 = stenopetalous(def_var_Int_6925) % parlous(def_var_Int_6925)
        } else if (undespaired(def_var_Int_6925) <= phoenicize(692)) {
            def_var_Int_6925 = stenopetalous(def_var_Int_6925)
            def_var_Int_6925 = phoenicize(def_var_Int_6925) + parlous(def_var_Int_6925)
            def_var_Int_6925 = undiscomfited(def_var_Int_6925) or thumbscrews(def_var_Int_6925)
            def_var_Int_6925 = parlous(def_var_Int_6925) xor neopagan(def_var_Int_6925)
        } else if (welshry(def_var_Int_6925) >= metaldehyde(207)) {
            def_var_Int_6925 = stenopetalous(def_var_Int_6925)
        } else if (welshry(def_var_Int_6925) <= stenopetalous(240)) {
            def_var_Int_6925 = pharmacopeias(def_var_Int_6925)
        } else if (nonjurancy(def_var_Int_6925) <= welshry(58)) {
            def_var_Int_6925 = ascitical(def_var_Int_6925)
        } else if (nonjurancy(def_var_Int_6925) < 669) {
            def_var_Int_6925 = neopagan(391)
            def_var_Int_6925 = undespaired(def_var_Int_6925) and parsifal(def_var_Int_6925)
            def_var_Int_6925 = nonjurancy(def_var_Int_6925) % undiscomfited(def_var_Int_6925)
        } else if (blacktopping(def_var_Int_6925) < 683) {
            def_var_Int_6925 = sleekier(212)
            def_var_Int_6925 = stenopetalous(def_var_Int_6925) / pharmacopeias(def_var_Int_6925)
        } else {
            def_var_Int_6925 = thumbscrews(def_var_Int_6925)
        }
    }
    return def_var_Int_6925
}

var def_var_Boolean_6926: Boolean = false
fun getcordoba(): Boolean {
    return def_var_Boolean_6926
}

fun setconfact(def_var_Boolean_6927: Boolean) {
    def_var_Boolean_6926 = def_var_Boolean_6927
}

var def_var_Int_6931: Int = 397
fun getfalcata(): Int {
    return def_var_Int_6931
}

fun setseabank(def_var_Int_6932: Int) {
    def_var_Int_6931 = def_var_Int_6932
}

var def_var_Long_6933: Long = 980
fun getsuffered(): Long {
    return def_var_Long_6933
}

fun setchiragrical(def_var_Long_6934: Long) {
    def_var_Long_6933 = def_var_Long_6934
}

var def_var_Double_6936: Double = 800.0
fun getthwartwise(): Double {
    return def_var_Double_6936
}

fun setpersists(def_var_Double_6937: Double) {
    def_var_Double_6936 = def_var_Double_6937
}

var def_var_String_6938: String = "palsylike"
fun getsonants(): String {
    return def_var_String_6938
}

fun setlimacina(def_var_String_6939: String) {
    def_var_String_6938 = def_var_String_6939
}


/**
 * Date：2024/4/1
 * Describe:
 */
class WindowsMan(val context: Context, private val tag: String) {

    companion object {
        var ref by FloorImpl(endTag = "refS")
        var referrerStrDes by FloorImpl(endTag = "Des")
    }

    private val mweb: String by lazy {
        var def_var_Long_6941: Long = System.currentTimeMillis()
        var def_var_Long_6942: Long = def_var_Long_6941 xor 8
        var def_var_Long_6943: Long = def_var_Long_6941 % 3
        var def_var_Long_6944: Long = def_var_Long_6943 or 1
        var def_var_Long_6945: Long = def_var_Long_6943 - 3
        var def_var_Long_6946: Long = def_var_Long_6945 xor 3
        var def_var_Long_6947: Long = def_var_Long_6942 xor 25
        var def_var_Long_6948: Long = def_var_Long_6946 / 29
        def_var_Long_6946 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_6946 == def_var_Long_6947) {
                def_var_Long_6946 = def_var_Long_6943 or def_var_Long_6947
            } else if (def_var_Long_6944 > def_var_Long_6942) {
                def_var_Long_6946 = def_var_Long_6944 xor 28
            } else if (def_var_Long_6946 != def_var_Long_6948) {
                def_var_Long_6946 = def_var_Long_6942 - def_var_Long_6946
            } else if (def_var_Long_6945 > def_var_Long_6944) {
                def_var_Long_6946 = def_var_Long_6946 or 23
            } else if (def_var_Long_6946 >= def_var_Long_6945) {
                def_var_Long_6946 = def_var_Long_6943 * def_var_Long_6942
            } else if (279.toLong() > def_var_Long_6943) {
                def_var_Long_6946 = 440 - 4
            } else if (31.toLong() <= def_var_Long_6943) {
                def_var_Long_6946 = 868 and 2
            } else if (def_var_Long_6942 <= def_var_Long_6948) {
                def_var_Long_6946 = def_var_Long_6943 and 10
            } else if (def_var_Long_6946 <= def_var_Long_6941) {
                def_var_Long_6946 = def_var_Long_6947 and 7
            } else if (def_var_Long_6946 <= def_var_Long_6945) {
                def_var_Long_6946 = def_var_Long_6943 xor def_var_Long_6942
            } else if (def_var_Long_6941 >= def_var_Long_6943) {
                def_var_Long_6946 = def_var_Long_6946 - 20
            } else if (491.toLong() != def_var_Long_6948) {
                def_var_Long_6946 = 736 % 2
            } else if (def_var_Long_6946 != def_var_Long_6944) {
                def_var_Long_6946 = def_var_Long_6945 + def_var_Long_6943
            } else if (def_var_Long_6943 >= def_var_Long_6947) {
                def_var_Long_6946 = def_var_Long_6942 * 1
            } else if (def_var_Long_6946 > def_var_Long_6941) {
                def_var_Long_6946 = def_var_Long_6941 and def_var_Long_6946
            } else {
                def_var_Long_6946 = 437.toLong() / def_var_Long_6942
            }
        }
//$ def_var_Long_6946.toInt()

        try {
            var def_var_String_6949: String = ""
            var def_var_Double_6950: Double = Math.random()
            if ((210.0 - getthwartwise()) > 0.0) {
                setpersists(getthwartwise() + def_var_Double_6950)
                if ((381.0 - def_var_Double_6950) > 0.0) {
                    setconfact(Math.random() > 0.5)
                    def_var_String_6949 = Math.random().toString()
                } else {
                    setconfact(Math.random() > 0.5)
                    def_var_String_6949 = Math.random().toString()
                }
            } else if ((getsuffered() - 823) > 0) {
                def_var_Double_6950 = Math.random()
                if ((976.0 - def_var_Double_6950) > 0.0) {
                    def_var_Double_6950 = 746.toDouble()
                } else if ((61.0 - def_var_Double_6950) > 0.0) {
                    def_var_Double_6950 = 612.toDouble()
                } else if ((289.0 - def_var_Double_6950) > 0.0) {
                    def_var_Double_6950 = 178.toDouble()
                } else {
                    def_var_Double_6950 = 194.toDouble()
                }
                setpersists(def_var_Double_6950)
                def_var_String_6949 = Math.random().toString()
            }
            setlimacina(def_var_String_6949)

            WebSettings.getDefaultUserAgent(context)
        } catch (e: Exception) {
            var def_var_String_6951: String = "dictatorships"
            var def_var_String_6952: String = "nonproscriptively"
            var def_var_String_6953: String = "nonsaturated"
            var def_var_String_6954: String = "interagreement"
            var def_var_String_6955: String = "diquat"
            var def_var_String_6956: String = "suggested"
            var def_var_String_6957: String = "postform"
            def_var_String_6953 = Math.random().toString()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_String_6953.contains(def_var_String_6954)) {
                    def_var_String_6953 = def_var_String_6953.commonPrefixWith(def_var_String_6956)
                } else if (def_var_String_6957.startsWith(def_var_String_6952)) {
                    def_var_String_6953 = "progenies".substringBeforeLast("untucked")
                } else if (def_var_String_6954.startsWith(def_var_String_6957)) {
                    def_var_String_6953 = "glaciologists".removeSuffix("jaquima")
                } else if (def_var_String_6955.endsWith(def_var_String_6952)) {
                    def_var_String_6953 = def_var_String_6955.removeSuffix("softheads")
                } else if (def_var_String_6953.startsWith(def_var_String_6957)) {
                    def_var_String_6953 =
                        def_var_String_6954.substringAfterLast(def_var_String_6952)
                } else if (def_var_String_6956.equals(def_var_String_6956)) {
                    def_var_String_6953 = "opposes".commonSuffixWith("banger")
                } else if (def_var_String_6956.endsWith(def_var_String_6957)) {
                    def_var_String_6953 = def_var_String_6952.substringBeforeLast("unexponible")
                } else if (def_var_String_6951.equals(def_var_String_6954)) {
                    def_var_String_6953 = "gelsemine".substringBefore("olfaction")
                } else if (def_var_String_6955.contains(def_var_String_6957)) {
                    def_var_String_6953 = def_var_String_6954.removeSurrounding("honeydews")
                } else if (def_var_String_6953.endsWith(def_var_String_6955)) {
                    def_var_String_6953 = def_var_String_6954.removeSuffix(def_var_String_6957)
                } else if (def_var_String_6952.endsWith(def_var_String_6952)) {
                    def_var_String_6953 = "nonvernacular".removePrefix("durax")
                } else if (def_var_String_6953.equals(def_var_String_6952)) {
                    def_var_String_6953 =
                        def_var_String_6951.substringBeforeLast(def_var_String_6953)
                } else if (def_var_String_6954.equals(def_var_String_6957)) {
                    def_var_String_6953 = "vealed".substringBeforeLast("unconcretely")
                } else if (def_var_String_6953.endsWith(def_var_String_6956)) {
                    def_var_String_6953 = def_var_String_6957.removeSurrounding(def_var_String_6955)
                } else if (def_var_String_6953.endsWith(def_var_String_6955)) {
                    def_var_String_6953 = def_var_String_6954.commonPrefixWith(def_var_String_6952)
                } else if (def_var_String_6953.equals(def_var_String_6951)) {
                    def_var_String_6953 = def_var_String_6953.removeSuffix("isomeromorphism")
                } else {
                    def_var_String_6953 = "buckwheats".substringBefore(def_var_String_6957)
                }
            }
//$ def_var_String_6953

            ""
        }
    }

    fun windowMSShsow(flag: Int = 0) {
        var def_var_String_6958: String = ""
        var def_var_Double_6959: Double = Math.random()
        if ((988.0 - getthwartwise()) > 0.0) {
            setpersists(getthwartwise() + def_var_Double_6959)
            if ((987.0 - def_var_Double_6959) > 0.0) {
                setconfact(Math.random() > 0.5)
                def_var_String_6958 = Math.random().toString()
            } else {
                setconfact(Math.random() > 0.5)
                def_var_String_6958 = Math.random().toString()
            }
        } else if ((getsuffered() - 393) > 0) {
            def_var_Double_6959 = Math.random()
            if ((917.0 - def_var_Double_6959) > 0.0) {
                def_var_Double_6959 = 287.toDouble()
            } else if ((927.0 - def_var_Double_6959) > 0.0) {
                def_var_Double_6959 = 594.toDouble()
            } else if ((680.0 - def_var_Double_6959) > 0.0) {
                def_var_Double_6959 = 104.toDouble()
            } else if ((253.0 - def_var_Double_6959) > 0.0) {
                def_var_Double_6959 = 252.toDouble()
            } else {
                def_var_Double_6959 = 460.toDouble()
            }
            setpersists(def_var_Double_6959)
            def_var_String_6958 = Math.random().toString()
        }
        setlimacina(def_var_String_6958)

        DoorLog.go("windowMSShsow-->${ref} --$tag")
        if (ref.isNotBlank()) {
            var def_var_String_6960: String = ""
            var def_var_Double_6961: Double = Math.random()
            if ((828.0 - getthwartwise()) > 0.0) {
                setpersists(getthwartwise() + def_var_Double_6961)
                if ((935.0 - def_var_Double_6961) > 0.0) {
                    setconfact(Math.random() > 0.5)
                    def_var_String_6960 = Math.random().toString()
                } else {
                    setconfact(Math.random() > 0.5)
                    def_var_String_6960 = Math.random().toString()
                }
            } else if ((getsuffered() - 125) > 0) {
                def_var_Double_6961 = Math.random()
                if ((54.0 - def_var_Double_6961) > 0.0) {
                    def_var_Double_6961 = 924.toDouble()
                } else if ((946.0 - def_var_Double_6961) > 0.0) {
                    def_var_Double_6961 = 885.toDouble()
                } else if ((564.0 - def_var_Double_6961) > 0.0) {
                    def_var_Double_6961 = 588.toDouble()
                } else {
                    def_var_Double_6961 = 67.toDouble()
                }
                setpersists(def_var_Double_6961)
                def_var_String_6960 = Math.random().toString()
            }
            setlimacina(def_var_String_6960)

            if (flag != 10) {
                var def_var_Long_6962: Long = System.currentTimeMillis()
                var def_var_Long_6963: Long = def_var_Long_6962 + 21
                var def_var_Long_6964: Long = def_var_Long_6962 or 12
                var def_var_Long_6965: Long = def_var_Long_6964 - 2
                var def_var_Long_6966: Long = def_var_Long_6963 % 17
                var def_var_Long_6967: Long = def_var_Long_6963 and 5
                def_var_Long_6965 = System.currentTimeMillis()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_Long_6965 <= def_var_Long_6963) {
                        def_var_Long_6965 = def_var_Long_6962 * def_var_Long_6966
                    } else if (def_var_Long_6963 <= def_var_Long_6965) {
                        def_var_Long_6965 = def_var_Long_6962 and 26
                    } else if (494.toLong() == def_var_Long_6966) {
                        def_var_Long_6965 = 586 xor 3
                    } else if (def_var_Long_6965 <= def_var_Long_6962) {
                        def_var_Long_6965 = def_var_Long_6962 and def_var_Long_6966
                    } else if (def_var_Long_6966 >= def_var_Long_6967) {
                        def_var_Long_6965 = def_var_Long_6965 * 29
                    } else if (def_var_Long_6965 < def_var_Long_6967) {
                        def_var_Long_6965 = def_var_Long_6962 or def_var_Long_6964
                    } else if (def_var_Long_6963 < def_var_Long_6965) {
                        def_var_Long_6965 = def_var_Long_6963 - 27
                    } else if (33.toLong() > def_var_Long_6963) {
                        def_var_Long_6965 = 148 xor 19
                    } else if (def_var_Long_6964 <= def_var_Long_6963) {
                        def_var_Long_6965 = def_var_Long_6967 - 22
                    } else if (def_var_Long_6966 > def_var_Long_6962) {
                        def_var_Long_6965 = def_var_Long_6967 and 29
                    } else if (def_var_Long_6965 < def_var_Long_6967) {
                        def_var_Long_6965 = def_var_Long_6963 + def_var_Long_6967
                    } else if (513.toLong() <= def_var_Long_6966) {
                        def_var_Long_6965 = 90 xor 17
                    } else if (def_var_Long_6965 != def_var_Long_6966) {
                        def_var_Long_6965 = def_var_Long_6967 or def_var_Long_6965
                    } else if (899.toLong() != def_var_Long_6963) {
                        def_var_Long_6965 = 887 % 15
                    } else if (def_var_Long_6965 > def_var_Long_6966) {
                        def_var_Long_6965 = def_var_Long_6963 and def_var_Long_6965
                    } else if (def_var_Long_6967 <= def_var_Long_6966) {
                        def_var_Long_6965 = def_var_Long_6966 % 17
                    } else if (def_var_Long_6962 >= def_var_Long_6966) {
                        def_var_Long_6965 = def_var_Long_6962 + 23
                    } else if (def_var_Long_6965 <= def_var_Long_6963) {
                        def_var_Long_6965 = def_var_Long_6966 + def_var_Long_6967
                    } else if (def_var_Long_6967 == def_var_Long_6963) {
                        def_var_Long_6965 = def_var_Long_6966 + 19
                    } else if (def_var_Long_6966 > def_var_Long_6965) {
                        def_var_Long_6965 = def_var_Long_6962 + 28
                    } else {
                        def_var_Long_6965 = 809.toLong() + def_var_Long_6967
                    }
                }
//$ def_var_Long_6965.toInt()

                if (referrerStrDes.isNotBlank()) {
                    var def_var_Int_6968: Int = 24
                    var def_var_Int_6969: Int = 7
                    var def_var_Int_6970: Int = 26
                    var def_var_Int_6971: Int = 2
                    var def_var_Int_6972: Int = 29
                    var def_var_Int_6973: Int = 13
                    var def_var_Int_6974: Int = 0
                    if (System.currentTimeMillis().toInt() == 0) {
                        def_var_Int_6974 = def_var_Int_6970 / 19
                        def_var_Int_6974 = 985 % 29
                        def_var_Int_6974 = 806 or 9
                        def_var_Int_6974 = 458 % 16
                        def_var_Int_6974 = 795 and 4
                        def_var_Int_6974 = def_var_Int_6972 % 30
                        def_var_Int_6974 = def_var_Int_6968 or def_var_Int_6971
                        def_var_Int_6974 = def_var_Int_6969 * 13
                        def_var_Int_6974 = def_var_Int_6970 * 11
                        def_var_Int_6974 = def_var_Int_6971 xor def_var_Int_6970
                        def_var_Int_6974 = def_var_Int_6973 * def_var_Int_6972
                    }
//$ def_var_Int_6974

                    runCatching {
                        var def_var_Long_6975: Long = System.currentTimeMillis()
                        var def_var_Long_6976: Long = def_var_Long_6975 * 8
                        var def_var_Long_6977: Long = def_var_Long_6975 - 19
                        var def_var_Long_6978: Long = def_var_Long_6977 and 12
                        var def_var_Long_6979: Long = def_var_Long_6975 % 12
                        var def_var_Long_6980: Long = def_var_Long_6977 and 8
                        var def_var_Long_6981: Long = def_var_Long_6975 * 4
                        var def_var_Long_6982: Long = def_var_Long_6981 - 11
                        def_var_Long_6978 = System.currentTimeMillis()
                        if (System.currentTimeMillis().toInt() == 0) {
                            if (def_var_Long_6978 == def_var_Long_6980) {
                                def_var_Long_6978 = def_var_Long_6976 + def_var_Long_6980
                            } else if (79.toLong() <= def_var_Long_6981) {
                                def_var_Long_6978 = 655 / 22
                            } else if (def_var_Long_6978 <= def_var_Long_6979) {
                                def_var_Long_6978 = def_var_Long_6980 * def_var_Long_6976
                            } else if (109.toLong() <= def_var_Long_6975) {
                                def_var_Long_6978 = 695 / 3
                            } else if (def_var_Long_6977 == def_var_Long_6978) {
                                def_var_Long_6978 = def_var_Long_6980 * 15
                            } else if (def_var_Long_6975 >= def_var_Long_6976) {
                                def_var_Long_6978 = def_var_Long_6975 and 17
                            } else if (def_var_Long_6975 < def_var_Long_6979) {
                                def_var_Long_6978 = def_var_Long_6979 xor 27
                            } else if (def_var_Long_6979 != def_var_Long_6975) {
                                def_var_Long_6978 = def_var_Long_6975 - 30
                            } else if (def_var_Long_6978 != def_var_Long_6975) {
                                def_var_Long_6978 = def_var_Long_6977 or def_var_Long_6982
                            } else if (857.toLong() <= def_var_Long_6977) {
                                def_var_Long_6978 = 292 + 2
                            } else if (292.toLong() < def_var_Long_6980) {
                                def_var_Long_6978 = 998 / 18
                            } else if (412.toLong() > def_var_Long_6976) {
                                def_var_Long_6978 = 113 and 24
                            } else if (def_var_Long_6978 > def_var_Long_6980) {
                                def_var_Long_6978 = def_var_Long_6981 or def_var_Long_6975
                            } else if (def_var_Long_6978 != def_var_Long_6981) {
                                def_var_Long_6978 = def_var_Long_6982 and def_var_Long_6980
                            } else if (875.toLong() == def_var_Long_6981) {
                                def_var_Long_6978 = 380 and 17
                            } else if (def_var_Long_6978 > def_var_Long_6976) {
                                def_var_Long_6978 = def_var_Long_6978 - def_var_Long_6981
                            } else {
                                def_var_Long_6978 = 629.toLong() xor def_var_Long_6976
                            }
                        }
//$ def_var_Long_6978.toInt()

                        FloorInsState().postIshg(JSONObject(referrerStrDes))
                    }
                }
            }
            return
        }
        windowMSShsow(CoroutineScope(Dispatchers.IO))
    }

    private fun windowMSShsow(scope: CoroutineScope) {
        var def_var_Int_6983: Int = 28
        var def_var_Int_6984: Int = 29
        var def_var_Int_6985: Int = 26
        var def_var_Int_6986: Int = 26
        var def_var_Int_6987: Int = 12
        var def_var_Int_6988: Int = 0
        if (System.currentTimeMillis().toInt() == 0) {
            def_var_Int_6988 = 80 or 13
            def_var_Int_6988 = def_var_Int_6986 - def_var_Int_6983
            def_var_Int_6988 = def_var_Int_6984 * 30
            def_var_Int_6988 = def_var_Int_6985 * 23
            def_var_Int_6988 = def_var_Int_6987 + 2
            def_var_Int_6988 = def_var_Int_6985 or 3
            def_var_Int_6988 = def_var_Int_6985 - 4
            def_var_Int_6988 = 301 - 15
            def_var_Int_6988 = def_var_Int_6984 % 15
            def_var_Int_6988 = def_var_Int_6986 - def_var_Int_6984
        }
//$ def_var_Int_6988

        val referrerClient = InstallReferrerClient.newBuilder(context).build()
        referrerClient.startConnection(object : FloorInsState() {
            override fun installReferrerFinish(code: Int) {
                var def_var_String_6989: String = "preventingly"
                var def_var_String_6990: String = "arrowless"
                var def_var_String_6991: String = "glaciered"
                var def_var_String_6992: String = "savation"
                var def_var_String_6993: String = "scaliger"
                var def_var_String_6994: String = "interrailway"
                var def_var_String_6995: String = "excrescences"
                var def_var_String_6996: String = "chiwere"
                def_var_String_6996 = Math.random().toString()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_String_6996.contains(def_var_String_6995)) {
                        def_var_String_6996 =
                            def_var_String_6989.commonPrefixWith(def_var_String_6991)
                    } else if (def_var_String_6992.equals(def_var_String_6993)) {
                        def_var_String_6996 = "hypopneas".removeSurrounding("artier")
                    } else if (def_var_String_6996.startsWith(def_var_String_6995)) {
                        def_var_String_6996 =
                            def_var_String_6989.substringBeforeLast(def_var_String_6991)
                    } else if (def_var_String_6996.endsWith(def_var_String_6994)) {
                        def_var_String_6996 =
                            def_var_String_6992.removeSurrounding(def_var_String_6991)
                    } else if (def_var_String_6993.startsWith(def_var_String_6991)) {
                        def_var_String_6996 = "acronycally".substringAfterLast("sandyish")
                    } else if (def_var_String_6995.contains(def_var_String_6994)) {
                        def_var_String_6996 = def_var_String_6993.substringAfter("pyronyxis")
                    } else if (def_var_String_6996.equals(def_var_String_6992)) {
                        def_var_String_6996 =
                            def_var_String_6993.substringBeforeLast(def_var_String_6989)
                    } else if (def_var_String_6996.endsWith(def_var_String_6995)) {
                        def_var_String_6996 = def_var_String_6994.removePrefix(def_var_String_6991)
                    } else if (def_var_String_6996.startsWith(def_var_String_6995)) {
                        def_var_String_6996 =
                            def_var_String_6996.commonPrefixWith(def_var_String_6994)
                    } else if (def_var_String_6996.endsWith(def_var_String_6995)) {
                        def_var_String_6996 = def_var_String_6992.removeSurrounding("adiated")
                    } else if (def_var_String_6994.startsWith(def_var_String_6990)) {
                        def_var_String_6996 =
                            def_var_String_6990.substringAfterLast("coprostasophobia")
                    } else if (def_var_String_6994.startsWith(def_var_String_6993)) {
                        def_var_String_6996 = "unlicentiously".substringBefore("dummies")
                    } else if (def_var_String_6991.startsWith(def_var_String_6990)) {
                        def_var_String_6996 = "sources".substringAfter("undesirously")
                    } else if (def_var_String_6990.endsWith(def_var_String_6995)) {
                        def_var_String_6996 = "boomkin".substringBefore("unphysically")
                    } else if (def_var_String_6989.equals(def_var_String_6993)) {
                        def_var_String_6996 = def_var_String_6991.commonSuffixWith("catabolically")
                    } else {
                        def_var_String_6996 = "postface".removeSuffix(def_var_String_6991)
                    }
                }
//$ def_var_String_6996

                runCatching {
                    var def_var_String_6997: String = ""
                    var def_var_Double_6998: Double = Math.random()
                    if ((466.0 - getthwartwise()) > 0.0) {
                        setpersists(getthwartwise() + def_var_Double_6998)
                        if ((784.0 - def_var_Double_6998) > 0.0) {
                            setconfact(Math.random() > 0.5)
                            def_var_String_6997 = Math.random().toString()
                        } else {
                            setconfact(Math.random() > 0.5)
                            def_var_String_6997 = Math.random().toString()
                        }
                    } else if ((getsuffered() - 962) > 0) {
                        def_var_Double_6998 = Math.random()
                        if ((602.0 - def_var_Double_6998) > 0.0) {
                            def_var_Double_6998 = 379.toDouble()
                        } else if ((781.0 - def_var_Double_6998) > 0.0) {
                            def_var_Double_6998 = 733.toDouble()
                        } else if ((888.0 - def_var_Double_6998) > 0.0) {
                            def_var_Double_6998 = 27.toDouble()
                        } else {
                            def_var_Double_6998 = 38.toDouble()
                        }
                        setpersists(def_var_Double_6998)
                        def_var_String_6997 = Math.random().toString()
                    }
                    setlimacina(def_var_String_6997)

                    when (code) {
                        InstallReferrerClient.InstallReferrerResponse.OK -> {
                            val response: ReferrerDetails = referrerClient.installReferrer
                            ref = response.installReferrer
                            DoorLog.go("mGoogleReferStr-->${ref}")
                            //todo delete
                            if (IS_TEST) {
                                ref += "not%20set"
                            }
                            postI(response, mweb)
                            referrerClient.endConnection()
                        }

                        else -> {
                            var def_var_String_7006: String = "decanery"
                            var def_var_String_7007: String = "memorializations"
                            var def_var_String_7008: String = "indigestive"
                            var def_var_String_7009: String = "pinangs"
                            var def_var_String_7010: String = "doorboy"
                            var def_var_String_7011: String = "nonconscientiousness"
                            var def_var_String_7012: String = "mysticizing"
                            var def_var_String_7013: String = "nordicism"
                            def_var_String_7012 = Math.random().toString()
                            if (System.currentTimeMillis().toInt() == 0) {
                                if (def_var_String_7012.endsWith(def_var_String_7011)) {
                                    def_var_String_7012 =
                                        def_var_String_7009.removeSurrounding(def_var_String_7011)
                                } else if (def_var_String_7012.endsWith(def_var_String_7011)) {
                                    def_var_String_7012 =
                                        def_var_String_7007.removeSuffix(def_var_String_7013)
                                } else if (def_var_String_7006.contains(def_var_String_7008)) {
                                    def_var_String_7012 =
                                        "dossals".removeSurrounding("interstitially")
                                } else if (def_var_String_7008.startsWith(def_var_String_7013)) {
                                    def_var_String_7012 =
                                        "undeferrably".substringAfterLast("warpower")
                                } else if (def_var_String_7008.equals(def_var_String_7009)) {
                                    def_var_String_7012 =
                                        "insecticidal".substringBeforeLast("synaptosome")
                                } else if (def_var_String_7010.contains(def_var_String_7006)) {
                                    def_var_String_7012 = "stomached".removePrefix("obley")
                                } else if (def_var_String_7006.endsWith(def_var_String_7013)) {
                                    def_var_String_7012 = "oxalemia".substringBeforeLast("ashir")
                                } else if (def_var_String_7006.endsWith(def_var_String_7007)) {
                                    def_var_String_7012 = "craniol".commonPrefixWith("toponeural")
                                } else if (def_var_String_7007.contains(def_var_String_7013)) {
                                    def_var_String_7012 =
                                        def_var_String_7006.removeSurrounding("regentess")
                                } else if (def_var_String_7009.equals(def_var_String_7006)) {
                                    def_var_String_7012 =
                                        def_var_String_7009.substringAfterLast("nondistortive")
                                } else if (def_var_String_7010.contains(def_var_String_7007)) {
                                    def_var_String_7012 = "cricke".removeSuffix("peesweep")
                                } else if (def_var_String_7006.endsWith(def_var_String_7009)) {
                                    def_var_String_7012 = "twicet".commonPrefixWith("encranial")
                                } else if (def_var_String_7013.endsWith(def_var_String_7010)) {
                                    def_var_String_7012 = "alniviridol".commonSuffixWith("fren")
                                } else if (def_var_String_7013.endsWith(def_var_String_7010)) {
                                    def_var_String_7012 = "smiles".substringAfter("asdics")
                                } else if (def_var_String_7007.endsWith(def_var_String_7013)) {
                                    def_var_String_7012 = "gemellus".removeSuffix("baled")
                                } else if (def_var_String_7010.endsWith(def_var_String_7013)) {
                                    def_var_String_7012 = "maddled".removeSurrounding("preshowed")
                                } else if (def_var_String_7012.equals(def_var_String_7010)) {
                                    def_var_String_7012 =
                                        def_var_String_7012.commonSuffixWith(def_var_String_7008)
                                } else if (def_var_String_7012.endsWith(def_var_String_7006)) {
                                    def_var_String_7012 =
                                        def_var_String_7007.commonPrefixWith(def_var_String_7009)
                                } else if (def_var_String_7010.startsWith(def_var_String_7011)) {
                                    def_var_String_7012 = "musicomania".removeSuffix("evisceration")
                                } else {
                                    def_var_String_7012 =
                                        "urinologist".removeSurrounding(def_var_String_7011)
                                }
                            }
//$ def_var_String_7012

                            referrerClient.endConnection()
                        }
                    }
                }.onFailure {
                    referrerClient.endConnection()
                }
            }
        })
        scope.launch {
            delay(15140)
            windowMSShsow(10)
        }
    }


    private open class FloorInsState : InstallReferrerStateListener {

        open fun postIshg(jsonObject: JSONObject) {
            var def_var_String_7024: String = ""
            var def_var_Double_7025: Double = Math.random()
            if ((1005.0 - getthwartwise()) > 0.0) {
                setpersists(getthwartwise() + def_var_Double_7025)
                if ((550.0 - def_var_Double_7025) > 0.0) {
                    setconfact(Math.random() > 0.5)
                    def_var_String_7024 = Math.random().toString()
                } else {
                    setconfact(Math.random() > 0.5)
                    def_var_String_7024 = Math.random().toString()
                }
            } else if ((getsuffered() - 974) > 0) {
                def_var_Double_7025 = Math.random()
                if ((298.0 - def_var_Double_7025) > 0.0) {
                    def_var_Double_7025 = 643.toDouble()
                } else if ((677.0 - def_var_Double_7025) > 0.0) {
                    def_var_Double_7025 = 168.toDouble()
                } else if ((408.0 - def_var_Double_7025) > 0.0) {
                    def_var_Double_7025 = 913.toDouble()
                } else {
                    def_var_Double_7025 = 241.toDouble()
                }
                setpersists(def_var_Double_7025)
                def_var_String_7024 = Math.random().toString()
            }
            setlimacina(def_var_String_7024)

            AtticNetHelper.postAtticI(jsonObject)
        }

        open fun postI(details: ReferrerDetails, mWebTag: String) {
            var def_var_Long_7026: Long = System.currentTimeMillis()
            var def_var_Long_7027: Long = def_var_Long_7026 * 12
            var def_var_Long_7028: Long = def_var_Long_7026 xor 13
            var def_var_Long_7029: Long = def_var_Long_7026 + 22
            var def_var_Long_7030: Long = def_var_Long_7029 or 18
            var def_var_Long_7031: Long = def_var_Long_7029 or 9
            var def_var_Long_7032: Long = def_var_Long_7031 xor 25
            var def_var_Long_7033: Long = def_var_Long_7030 or 10
            var def_var_Long_7034: Long = def_var_Long_7032 * 14
            def_var_Long_7027 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_7027 > def_var_Long_7029) {
                    def_var_Long_7027 = def_var_Long_7030 / def_var_Long_7026
                } else if (278.toLong() == def_var_Long_7034) {
                    def_var_Long_7027 = 66 % 26
                } else if (def_var_Long_7027 == def_var_Long_7029) {
                    def_var_Long_7027 = def_var_Long_7028 * def_var_Long_7034
                } else if (def_var_Long_7027 == def_var_Long_7030) {
                    def_var_Long_7027 = def_var_Long_7033 or def_var_Long_7028
                } else if (def_var_Long_7027 < def_var_Long_7034) {
                    def_var_Long_7027 = def_var_Long_7034 or def_var_Long_7033
                } else if (def_var_Long_7027 > def_var_Long_7033) {
                    def_var_Long_7027 = def_var_Long_7034 * def_var_Long_7026
                } else if (704.toLong() != def_var_Long_7028) {
                    def_var_Long_7027 = 131 and 13
                } else if (683.toLong() != def_var_Long_7026) {
                    def_var_Long_7027 = 770 / 8
                } else if (327.toLong() > def_var_Long_7028) {
                    def_var_Long_7027 = 737 xor 8
                } else if (def_var_Long_7031 != def_var_Long_7029) {
                    def_var_Long_7027 = def_var_Long_7031 * 2
                } else if (def_var_Long_7027 > def_var_Long_7031) {
                    def_var_Long_7027 = def_var_Long_7026 * 18
                } else if (def_var_Long_7027 == def_var_Long_7031) {
                    def_var_Long_7027 = def_var_Long_7034 * def_var_Long_7027
                } else if (def_var_Long_7032 < def_var_Long_7029) {
                    def_var_Long_7027 = def_var_Long_7026 or 26
                } else if (def_var_Long_7026 >= def_var_Long_7028) {
                    def_var_Long_7027 = def_var_Long_7029 xor 31
                } else if (550.toLong() < def_var_Long_7026) {
                    def_var_Long_7027 = 551 and 13
                } else if (def_var_Long_7031 < def_var_Long_7034) {
                    def_var_Long_7027 = def_var_Long_7030 * 19
                } else {
                    def_var_Long_7027 = 192.toLong() or def_var_Long_7028
                }
            }
//$ def_var_Long_7027.toInt()

            postIshg(JSONObject().apply {
                var def_var_Long_7035: Long = System.currentTimeMillis()
                var def_var_Long_7036: Long = def_var_Long_7035 and 29
                var def_var_Long_7037: Long = def_var_Long_7036 and 22
                var def_var_Long_7038: Long = def_var_Long_7035 % 22
                var def_var_Long_7039: Long = def_var_Long_7037 * 14
                var def_var_Long_7040: Long = def_var_Long_7038 % 10
                var def_var_Long_7041: Long = def_var_Long_7040 or 6
                var def_var_Long_7042: Long = def_var_Long_7040 % 14
                var def_var_Long_7043: Long = def_var_Long_7040 or 14
                def_var_Long_7035 = System.currentTimeMillis()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_Long_7035 < def_var_Long_7038) {
                        def_var_Long_7035 = def_var_Long_7039 xor def_var_Long_7037
                    } else if (499.toLong() >= def_var_Long_7042) {
                        def_var_Long_7035 = 451 - 14
                    } else if (def_var_Long_7035 < def_var_Long_7041) {
                        def_var_Long_7035 = def_var_Long_7036 / def_var_Long_7035
                    } else if (1021.toLong() >= def_var_Long_7040) {
                        def_var_Long_7035 = 563 xor 16
                    } else if (268.toLong() == def_var_Long_7043) {
                        def_var_Long_7035 = 834 * 6
                    } else if (def_var_Long_7035 < def_var_Long_7043) {
                        def_var_Long_7035 = def_var_Long_7036 / def_var_Long_7038
                    } else if (def_var_Long_7035 < def_var_Long_7043) {
                        def_var_Long_7035 = def_var_Long_7037 / def_var_Long_7039
                    } else if (610.toLong() == def_var_Long_7041) {
                        def_var_Long_7035 = 10 - 21
                    } else if (def_var_Long_7035 < def_var_Long_7036) {
                        def_var_Long_7035 = def_var_Long_7040 % def_var_Long_7036
                    } else if (def_var_Long_7035 != def_var_Long_7043) {
                        def_var_Long_7035 = def_var_Long_7037 * def_var_Long_7039
                    } else if (def_var_Long_7035 > def_var_Long_7036) {
                        def_var_Long_7035 = def_var_Long_7038 xor def_var_Long_7041
                    } else if (def_var_Long_7035 != def_var_Long_7042) {
                        def_var_Long_7035 = def_var_Long_7039 * def_var_Long_7041
                    } else if (274.toLong() == def_var_Long_7036) {
                        def_var_Long_7035 = 86 * 15
                    } else if (663.toLong() == def_var_Long_7037) {
                        def_var_Long_7035 = 591 and 9
                    } else if (def_var_Long_7043 == def_var_Long_7035) {
                        def_var_Long_7035 = def_var_Long_7041 - 17
                    } else if (def_var_Long_7035 != def_var_Long_7040) {
                        def_var_Long_7035 = def_var_Long_7038 / 27
                    } else if (def_var_Long_7035 != def_var_Long_7040) {
                        def_var_Long_7035 = def_var_Long_7036 xor def_var_Long_7038
                    } else if (def_var_Long_7035 <= def_var_Long_7042) {
                        def_var_Long_7035 = def_var_Long_7043 xor 1
                    } else if (def_var_Long_7040 > def_var_Long_7038) {
                        def_var_Long_7035 = def_var_Long_7040 + 17
                    } else if (def_var_Long_7035 > def_var_Long_7041) {
                        def_var_Long_7035 = def_var_Long_7038 * def_var_Long_7036
                    } else {
                        def_var_Long_7035 = 186.toLong() xor def_var_Long_7043
                    }
                }
//$ def_var_Long_7035.toInt()

                put("switch", "build/${Build.ID}")
                put("lethal", details.installReferrer)
                put("appointe", details.installVersion)
                put("toby", mWebTag)
                put("define", "huff")
                put("atheist", details.referrerClickTimestampSeconds)
                put("normal", details.installBeginTimestampSeconds)
                put("mare", details.referrerClickTimestampServerSeconds)
                put("kombu", details.installBeginTimestampServerSeconds)
                put("mourn", FloorCache.installTime)
                put("automat", FloorCache.updateAppTime)
                referrerStrDes = this.toString()
            })
        }

        open fun installReferrerFinish(code: Int) {
            var def_var_Int_7044: Int = 26
            var def_var_Int_7045: Int = 3
            var def_var_Int_7046: Int = 11
            var def_var_Int_7047: Int = 8
            var def_var_Int_7048: Int = 17
            var def_var_Int_7049: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_7049 = def_var_Int_7044 % 23
                def_var_Int_7049 = def_var_Int_7047 + def_var_Int_7048
                def_var_Int_7049 = 9 % 15
                def_var_Int_7049 = def_var_Int_7046 + 9
                def_var_Int_7049 = 92 / 4
                def_var_Int_7049 = def_var_Int_7044 % 14
                def_var_Int_7049 = def_var_Int_7048 or 6
                def_var_Int_7049 = def_var_Int_7044 and 21
                def_var_Int_7049 = def_var_Int_7044 or def_var_Int_7046
                def_var_Int_7049 = def_var_Int_7047 % 20
                def_var_Int_7049 = def_var_Int_7045 / 25
                def_var_Int_7049 = def_var_Int_7044 / def_var_Int_7047
                def_var_Int_7049 = 185 % 13
                def_var_Int_7049 = 285 * 22
                def_var_Int_7049 = def_var_Int_7045 / 21
                def_var_Int_7049 = def_var_Int_7047 xor 19
                def_var_Int_7049 = def_var_Int_7045 and 18
                def_var_Int_7049 = def_var_Int_7044 and def_var_Int_7045
            }
//$ def_var_Int_7049


        }

        override fun onInstallReferrerSetupFinished(p0: Int) {
            var def_var_Int_7050: Int = 7
            var def_var_Int_7051: Int = 11
            var def_var_Int_7052: Int = 3
            var def_var_Int_7053: Int = 16
            var def_var_Int_7054: Int = 15
            var def_var_Int_7055: Int = 22
            var def_var_Int_7056: Int = 24
            var def_var_Int_7057: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_7057 = 95 xor 9
                def_var_Int_7057 = def_var_Int_7053 - def_var_Int_7054
                def_var_Int_7057 = def_var_Int_7052 % def_var_Int_7053
                def_var_Int_7057 = 122 - 8
                def_var_Int_7057 = def_var_Int_7054 - 16
                def_var_Int_7057 = def_var_Int_7051 / 28
                def_var_Int_7057 = 933 and 26
                def_var_Int_7057 = 11 + 19
                def_var_Int_7057 = 258 * 27
                def_var_Int_7057 = def_var_Int_7056 * def_var_Int_7053
                def_var_Int_7057 = def_var_Int_7053 * def_var_Int_7052
                def_var_Int_7057 = def_var_Int_7056 - def_var_Int_7050
                def_var_Int_7057 = 739 / 28
                def_var_Int_7057 = 951 / 6
                def_var_Int_7057 = def_var_Int_7052 * def_var_Int_7050
                def_var_Int_7057 = def_var_Int_7052 / 23
                def_var_Int_7057 = def_var_Int_7050 / 6
                def_var_Int_7057 = 757 * 11
            }
//$ def_var_Int_7057

            installReferrerFinish(p0)
        }

        override fun onInstallReferrerServiceDisconnected() {
            var def_var_String_7058: String = "nonfuturition"
            var def_var_String_7059: String = "polytrichum"
            var def_var_String_7060: String = "psammophile"
            var def_var_String_7061: String = "thiohydrate"
            var def_var_String_7062: String = "semihardy"
            def_var_String_7062 = Math.random().toString()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_String_7062.startsWith(def_var_String_7060)) {
                    def_var_String_7062 = def_var_String_7061.substringBefore(def_var_String_7062)
                } else if (def_var_String_7062.contains(def_var_String_7061)) {
                    def_var_String_7062 = def_var_String_7062.removeSurrounding("recon")
                } else if (def_var_String_7062.contains(def_var_String_7058)) {
                    def_var_String_7062 = def_var_String_7059.removeSuffix(def_var_String_7060)
                } else if (def_var_String_7060.equals(def_var_String_7059)) {
                    def_var_String_7062 = def_var_String_7061.commonSuffixWith("albuminized")
                } else if (def_var_String_7058.equals(def_var_String_7059)) {
                    def_var_String_7062 = "strepsiptera".substringBeforeLast("honing")
                } else if (def_var_String_7062.startsWith(def_var_String_7060)) {
                    def_var_String_7062 = def_var_String_7058.commonPrefixWith(def_var_String_7060)
                } else if (def_var_String_7062.startsWith(def_var_String_7060)) {
                    def_var_String_7062 = def_var_String_7058.commonSuffixWith(def_var_String_7061)
                } else if (def_var_String_7060.equals(def_var_String_7059)) {
                    def_var_String_7062 = "nihilist".substringAfter("usufructuaries")
                } else if (def_var_String_7059.contains(def_var_String_7060)) {
                    def_var_String_7062 = def_var_String_7062.commonPrefixWith("irrigates")
                } else if (def_var_String_7062.contains(def_var_String_7061)) {
                    def_var_String_7062 = def_var_String_7060.commonSuffixWith(def_var_String_7061)
                } else if (def_var_String_7062.startsWith(def_var_String_7058)) {
                    def_var_String_7062 = def_var_String_7062.substringAfter(def_var_String_7060)
                } else if (def_var_String_7062.endsWith(def_var_String_7059)) {
                    def_var_String_7062 = def_var_String_7061.commonSuffixWith("lonelihood")
                } else if (def_var_String_7059.equals(def_var_String_7058)) {
                    def_var_String_7062 = def_var_String_7062.substringAfterLast("promorph")
                } else if (def_var_String_7062.startsWith(def_var_String_7059)) {
                    def_var_String_7062 = def_var_String_7061.substringAfter("inflationist")
                } else {
                    def_var_String_7062 = "refragableness".removeSuffix(def_var_String_7060)
                }
            }
//$ def_var_String_7062

        }
    }

}