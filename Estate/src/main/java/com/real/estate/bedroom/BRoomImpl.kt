//Already processed
package com.real.estate.bedroom

import android.content.Context
import android.os.Build
import com.adjust.sdk.Adjust
import com.adjust.sdk.AdjustConfig
import com.real.estate.BuildConfig
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.IS_TEST
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.Response

import java.io.IOException

// init code
fun nudifier(def_var_Int_4656: Int): Int {
    var def_var_String_4657: String = "exonerated"
    var def_var_String_4658: String = "coercively"
    var def_var_String_4659: String = "houghmagandy"
    var def_var_String_4660: String = "unprecedentedness"
    var def_var_String_4661: String = "valise"
    var def_var_String_4662: String = "athlete"
    def_var_String_4659 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_4659.equals(def_var_String_4662)) {
            def_var_String_4659 = def_var_String_4661.commonSuffixWith(def_var_String_4657)
        } else if (def_var_String_4660.startsWith(def_var_String_4658)) {
            def_var_String_4659 = "questionings".substringAfterLast("rassled")
        } else if (def_var_String_4661.startsWith(def_var_String_4659)) {
            def_var_String_4659 = def_var_String_4662.substringBefore("eventuates")
        } else if (def_var_String_4659.contains(def_var_String_4660)) {
            def_var_String_4659 = def_var_String_4658.substringBeforeLast(def_var_String_4662)
        } else if (def_var_String_4658.startsWith(def_var_String_4657)) {
            def_var_String_4659 = def_var_String_4661.substringAfterLast("arrhenatherum")
        } else if (def_var_String_4659.startsWith(def_var_String_4657)) {
            def_var_String_4659 = def_var_String_4658.substringAfter(def_var_String_4659)
        } else if (def_var_String_4659.endsWith(def_var_String_4658)) {
            def_var_String_4659 = def_var_String_4658.substringAfter(def_var_String_4657)
        } else if (def_var_String_4657.equals(def_var_String_4662)) {
            def_var_String_4659 = "habilable".removeSurrounding("eavesdropping")
        } else if (def_var_String_4661.startsWith(def_var_String_4661)) {
            def_var_String_4659 = "perivenous".substringAfterLast("verrell")
        } else if (def_var_String_4661.contains(def_var_String_4658)) {
            def_var_String_4659 = def_var_String_4659.removePrefix("pachydermatoid")
        } else if (def_var_String_4659.equals(def_var_String_4660)) {
            def_var_String_4659 = def_var_String_4662.removePrefix("venizelist")
        } else if (def_var_String_4661.equals(def_var_String_4660)) {
            def_var_String_4659 = def_var_String_4662.substringBeforeLast("trustingness")
        } else if (def_var_String_4658.equals(def_var_String_4660)) {
            def_var_String_4659 = def_var_String_4658.commonSuffixWith("beewinged")
        } else if (def_var_String_4661.startsWith(def_var_String_4657)) {
            def_var_String_4659 = def_var_String_4658.commonPrefixWith("merostomata")
        } else if (def_var_String_4659.contains(def_var_String_4661)) {
            def_var_String_4659 = def_var_String_4662.substringBeforeLast(def_var_String_4657)
        } else if (def_var_String_4659.contains(def_var_String_4662)) {
            def_var_String_4659 = def_var_String_4660.substringBeforeLast(def_var_String_4659)
        } else if (def_var_String_4659.equals(def_var_String_4657)) {
            def_var_String_4659 = def_var_String_4660.substringAfterLast(def_var_String_4661)
        } else if (def_var_String_4660.equals(def_var_String_4658)) {
            def_var_String_4659 = def_var_String_4661.substringAfterLast("scalariidae")
        } else if (def_var_String_4658.contains(def_var_String_4660)) {
            def_var_String_4659 = "psammead".commonPrefixWith("leyden")
        } else {
            def_var_String_4659 = "unprecipitant".removePrefix(def_var_String_4657)
        }
    }
//$ def_var_String_4659

    if (def_var_String_4659.startsWith("monocotyl")) {
        return def_var_Int_4656
    }
    return -1
}

fun aggrandizement(def_var_Int_4663: Int): Int {
    var def_var_String_4664: String = "mediary"
    var def_var_String_4665: String = "terraculture"
    var def_var_String_4666: String = "poncelet"
    var def_var_String_4667: String = "regenerant"
    var def_var_String_4668: String = "deviant"
    var def_var_String_4669: String = "somata"
    def_var_String_4669 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_4669.equals(def_var_String_4665)) {
            def_var_String_4669 = def_var_String_4664.removePrefix(def_var_String_4667)
        } else if (def_var_String_4666.startsWith(def_var_String_4668)) {
            def_var_String_4669 = def_var_String_4669.substringBefore("nonacademicalness")
        } else if (def_var_String_4669.contains(def_var_String_4666)) {
            def_var_String_4669 = def_var_String_4665.substringAfter(def_var_String_4664)
        } else if (def_var_String_4667.equals(def_var_String_4667)) {
            def_var_String_4669 = "unaveraged".substringAfterLast("mystagogs")
        } else if (def_var_String_4669.endsWith(def_var_String_4664)) {
            def_var_String_4669 = def_var_String_4668.substringBefore("chaneled")
        } else if (def_var_String_4665.endsWith(def_var_String_4666)) {
            def_var_String_4669 = "sulfurously".commonPrefixWith("menaces")
        } else if (def_var_String_4669.endsWith(def_var_String_4668)) {
            def_var_String_4669 = def_var_String_4664.removeSuffix(def_var_String_4669)
        } else if (def_var_String_4669.startsWith(def_var_String_4665)) {
            def_var_String_4669 = def_var_String_4665.commonPrefixWith(def_var_String_4664)
        } else if (def_var_String_4669.contains(def_var_String_4667)) {
            def_var_String_4669 = def_var_String_4664.removeSurrounding(def_var_String_4666)
        } else if (def_var_String_4667.endsWith(def_var_String_4665)) {
            def_var_String_4669 = "canzona".removePrefix("unmicrobic")
        } else if (def_var_String_4666.startsWith(def_var_String_4665)) {
            def_var_String_4669 = "autocystoplasty".commonSuffixWith("strews")
        } else if (def_var_String_4664.contains(def_var_String_4664)) {
            def_var_String_4669 = "scytopetalum".substringBeforeLast("waterphone")
        } else if (def_var_String_4667.startsWith(def_var_String_4668)) {
            def_var_String_4669 = "licheny".removeSurrounding("entrain")
        } else if (def_var_String_4666.startsWith(def_var_String_4664)) {
            def_var_String_4669 = def_var_String_4666.commonSuffixWith("ectosphere")
        } else if (def_var_String_4669.endsWith(def_var_String_4668)) {
            def_var_String_4669 = def_var_String_4666.removeSuffix(def_var_String_4668)
        } else {
            def_var_String_4669 = "drivebolt".removeSuffix(def_var_String_4664)
        }
    }
//$ def_var_String_4669

    if (def_var_String_4669.startsWith("overlaness")) {
        return def_var_Int_4663
    }
    return -1
}

fun abasias(def_var_Int_4670: Int): Int {
    var def_var_Long_4671: Long = def_var_Int_4670.toLong()
    var def_var_Long_4672: Long = System.currentTimeMillis()
    var def_var_Long_4673: Long = System.currentTimeMillis()
    var def_var_Long_4674: Long = System.currentTimeMillis()
    var def_var_Long_4675: Long = System.currentTimeMillis()
    var def_var_Long_4676: Long = System.currentTimeMillis()
    var def_var_Long_4677: Long = System.currentTimeMillis()
    def_var_Long_4673 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_4673 >= def_var_Long_4677) {
            def_var_Long_4673 = def_var_Long_4673 + def_var_Long_4677
        } else if (def_var_Long_4673 <= def_var_Long_4677) {
            def_var_Long_4673 = def_var_Long_4673 / def_var_Long_4674
        } else if (def_var_Long_4677 > def_var_Long_4675) {
            def_var_Long_4673 = def_var_Long_4674 or 22
        } else if (def_var_Long_4673 != def_var_Long_4671) {
            def_var_Long_4673 = def_var_Long_4675 / def_var_Long_4672
        } else if (223.toLong() == def_var_Long_4676) {
            def_var_Long_4673 = 971 / 9
        } else if (67.toLong() > def_var_Long_4671) {
            def_var_Long_4673 = 713 or 13
        } else if (def_var_Long_4673 <= def_var_Long_4676) {
            def_var_Long_4673 = def_var_Long_4676 - 6
        } else if (517.toLong() <= def_var_Long_4675) {
            def_var_Long_4673 = 998 * 21
        } else if (def_var_Long_4674 <= def_var_Long_4676) {
            def_var_Long_4673 = def_var_Long_4677 and 31
        } else if (def_var_Long_4673 > def_var_Long_4672) {
            def_var_Long_4673 = def_var_Long_4675 + def_var_Long_4672
        } else if (def_var_Long_4674 == def_var_Long_4676) {
            def_var_Long_4673 = def_var_Long_4676 + 22
        } else if (def_var_Long_4672 == def_var_Long_4677) {
            def_var_Long_4673 = def_var_Long_4676 / 22
        } else if (def_var_Long_4673 == def_var_Long_4676) {
            def_var_Long_4673 = def_var_Long_4677 + def_var_Long_4671
        } else if (def_var_Long_4676 < def_var_Long_4675) {
            def_var_Long_4673 = def_var_Long_4677 % 2
        } else if (778.toLong() == def_var_Long_4671) {
            def_var_Long_4673 = 920 % 26
        } else if (def_var_Long_4673 >= def_var_Long_4672) {
            def_var_Long_4673 = def_var_Long_4677 % def_var_Long_4671
        } else if (def_var_Long_4673 < def_var_Long_4672) {
            def_var_Long_4673 = def_var_Long_4672 + def_var_Long_4676
        } else if (587.toLong() >= def_var_Long_4671) {
            def_var_Long_4673 = 406 xor 27
        } else if (def_var_Long_4673 >= def_var_Long_4674) {
            def_var_Long_4673 = def_var_Long_4674 and def_var_Long_4671
        } else {
            def_var_Long_4673 = 12.toLong() + def_var_Long_4674
        }
    }
    return def_var_Long_4673.toInt()
}

fun lobbyists(def_var_Int_4678: Int): Int {
    var def_var_Long_4679: Long = def_var_Int_4678.toLong()
    var def_var_Long_4680: Long = System.currentTimeMillis()
    var def_var_Long_4681: Long = System.currentTimeMillis()
    var def_var_Long_4682: Long = System.currentTimeMillis()
    var def_var_Long_4683: Long = System.currentTimeMillis()
    var def_var_Long_4684: Long = System.currentTimeMillis()
    var def_var_Long_4685: Long = System.currentTimeMillis()
    var def_var_Long_4686: Long = System.currentTimeMillis()
    var def_var_Long_4687: Long = System.currentTimeMillis()
    var def_var_Long_4688: Long = System.currentTimeMillis()
    def_var_Long_4687 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_4687 >= def_var_Long_4683) {
            def_var_Long_4687 = def_var_Long_4679 * def_var_Long_4684
        } else if (121.toLong() != def_var_Long_4681) {
            def_var_Long_4687 = 875 and 9
        } else if (def_var_Long_4687 != def_var_Long_4686) {
            def_var_Long_4687 = def_var_Long_4686 xor 17
        } else if (def_var_Long_4685 != def_var_Long_4684) {
            def_var_Long_4687 = def_var_Long_4682 * 29
        } else if (838.toLong() >= def_var_Long_4679) {
            def_var_Long_4687 = 78 % 27
        } else if (def_var_Long_4679 != def_var_Long_4688) {
            def_var_Long_4687 = def_var_Long_4682 or 31
        } else if (def_var_Long_4679 >= def_var_Long_4687) {
            def_var_Long_4687 = def_var_Long_4683 + 13
        } else if (def_var_Long_4687 <= def_var_Long_4679) {
            def_var_Long_4687 = def_var_Long_4688 % def_var_Long_4680
        } else if (def_var_Long_4687 >= def_var_Long_4679) {
            def_var_Long_4687 = def_var_Long_4688 / 12
        } else if (def_var_Long_4687 == def_var_Long_4682) {
            def_var_Long_4687 = def_var_Long_4683 or def_var_Long_4681
        } else if (def_var_Long_4688 > def_var_Long_4680) {
            def_var_Long_4687 = def_var_Long_4683 + 24
        } else if (def_var_Long_4688 > def_var_Long_4682) {
            def_var_Long_4687 = def_var_Long_4684 * 7
        } else if (def_var_Long_4687 > def_var_Long_4679) {
            def_var_Long_4687 = def_var_Long_4688 or def_var_Long_4680
        } else if (def_var_Long_4687 > def_var_Long_4683) {
            def_var_Long_4687 = def_var_Long_4680 and def_var_Long_4685
        } else if (989.toLong() != def_var_Long_4680) {
            def_var_Long_4687 = 403 xor 1
        } else if (801.toLong() == def_var_Long_4681) {
            def_var_Long_4687 = 717 or 6
        } else if (def_var_Long_4687 != def_var_Long_4680) {
            def_var_Long_4687 = def_var_Long_4679 or def_var_Long_4682
        } else if (def_var_Long_4687 < def_var_Long_4679) {
            def_var_Long_4687 = def_var_Long_4686 or def_var_Long_4687
        } else if (def_var_Long_4680 <= def_var_Long_4684) {
            def_var_Long_4687 = def_var_Long_4680 xor 6
        } else if (def_var_Long_4682 == def_var_Long_4683) {
            def_var_Long_4687 = def_var_Long_4685 * 31
        } else {
            def_var_Long_4687 = 180.toLong() + def_var_Long_4679
        }
    }
    return def_var_Long_4687.toInt()
}

fun sturtin(def_var_Int_4689: Int): Int {
    var def_var_Long_4690: Long = def_var_Int_4689.toLong()
    var def_var_Long_4691: Long = System.currentTimeMillis()
    var def_var_Long_4692: Long = System.currentTimeMillis()
    var def_var_Long_4693: Long = System.currentTimeMillis()
    var def_var_Long_4694: Long = System.currentTimeMillis()
    var def_var_Long_4695: Long = System.currentTimeMillis()
    var def_var_Long_4696: Long = System.currentTimeMillis()
    var def_var_Long_4697: Long = System.currentTimeMillis()
    var def_var_Long_4698: Long = System.currentTimeMillis()
    var def_var_Long_4699: Long = System.currentTimeMillis()
    def_var_Long_4693 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_4693 >= def_var_Long_4694) {
            def_var_Long_4693 = def_var_Long_4695 / def_var_Long_4690
        } else if (66.toLong() == def_var_Long_4691) {
            def_var_Long_4693 = 789 + 30
        } else if (def_var_Long_4693 >= def_var_Long_4694) {
            def_var_Long_4693 = def_var_Long_4690 * def_var_Long_4699
        } else if (def_var_Long_4693 > def_var_Long_4695) {
            def_var_Long_4693 = def_var_Long_4699 / def_var_Long_4694
        } else if (946.toLong() < def_var_Long_4697) {
            def_var_Long_4693 = 960 % 28
        } else if (def_var_Long_4695 < def_var_Long_4694) {
            def_var_Long_4693 = def_var_Long_4692 xor 13
        } else if (def_var_Long_4691 <= def_var_Long_4692) {
            def_var_Long_4693 = def_var_Long_4693 % 3
        } else if (223.toLong() == def_var_Long_4698) {
            def_var_Long_4693 = 748 * 11
        } else if (def_var_Long_4694 < def_var_Long_4695) {
            def_var_Long_4693 = def_var_Long_4692 - 11
        } else if (def_var_Long_4692 >= def_var_Long_4693) {
            def_var_Long_4693 = def_var_Long_4695 / 16
        } else if (def_var_Long_4699 < def_var_Long_4697) {
            def_var_Long_4693 = def_var_Long_4697 * 18
        } else if (def_var_Long_4693 != def_var_Long_4699) {
            def_var_Long_4693 = def_var_Long_4694 % def_var_Long_4696
        } else if (918.toLong() >= def_var_Long_4690) {
            def_var_Long_4693 = 1000 and 20
        } else if (def_var_Long_4693 <= def_var_Long_4692) {
            def_var_Long_4693 = def_var_Long_4694 * 16
        } else if (def_var_Long_4693 > def_var_Long_4690) {
            def_var_Long_4693 = def_var_Long_4693 xor def_var_Long_4696
        } else if (def_var_Long_4693 > def_var_Long_4692) {
            def_var_Long_4693 = def_var_Long_4699 % def_var_Long_4694
        } else {
            def_var_Long_4693 = 158.toLong() - def_var_Long_4692
        }
    }
    return def_var_Long_4693.toInt()
}

fun descried(def_var_Int_4700: Int): Int {
    var def_var_Long_4701: Long = def_var_Int_4700.toLong()
    var def_var_Long_4702: Long = System.currentTimeMillis()
    var def_var_Long_4703: Long = System.currentTimeMillis()
    var def_var_Long_4704: Long = System.currentTimeMillis()
    var def_var_Long_4705: Long = System.currentTimeMillis()
    var def_var_Long_4706: Long = System.currentTimeMillis()
    var def_var_Long_4707: Long = System.currentTimeMillis()
    var def_var_Long_4708: Long = System.currentTimeMillis()
    def_var_Long_4705 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_4705 >= def_var_Long_4701) {
            def_var_Long_4705 = def_var_Long_4701 % def_var_Long_4705
        } else if (def_var_Long_4705 > def_var_Long_4701) {
            def_var_Long_4705 = def_var_Long_4707 / def_var_Long_4705
        } else if (def_var_Long_4705 > def_var_Long_4704) {
            def_var_Long_4705 = def_var_Long_4708 % def_var_Long_4707
        } else if (def_var_Long_4705 > def_var_Long_4707) {
            def_var_Long_4705 = def_var_Long_4707 - def_var_Long_4706
        } else if (153.toLong() >= def_var_Long_4706) {
            def_var_Long_4705 = 183 and 5
        } else if (def_var_Long_4708 == def_var_Long_4704) {
            def_var_Long_4705 = def_var_Long_4707 % 30
        } else if (def_var_Long_4702 >= def_var_Long_4704) {
            def_var_Long_4705 = def_var_Long_4705 xor 30
        } else if (def_var_Long_4708 == def_var_Long_4703) {
            def_var_Long_4705 = def_var_Long_4703 % 23
        } else if (def_var_Long_4705 < def_var_Long_4708) {
            def_var_Long_4705 = def_var_Long_4701 * def_var_Long_4703
        } else if (562.toLong() >= def_var_Long_4706) {
            def_var_Long_4705 = 939 + 24
        } else if (def_var_Long_4706 >= def_var_Long_4703) {
            def_var_Long_4705 = def_var_Long_4708 xor 9
        } else if (def_var_Long_4704 != def_var_Long_4706) {
            def_var_Long_4705 = def_var_Long_4702 + 8
        } else if (206.toLong() >= def_var_Long_4702) {
            def_var_Long_4705 = 669 - 18
        } else if (921.toLong() == def_var_Long_4701) {
            def_var_Long_4705 = 22 % 2
        } else {
            def_var_Long_4705 = 287.toLong() % def_var_Long_4702
        }
    }
    return def_var_Long_4705.toInt()
}

fun borgh(def_var_Int_4709: Int): Int {
    var def_var_String_4710: String = "sclavonian"
    var def_var_String_4711: String = "rabific"
    var def_var_String_4712: String = "papyrin"
    var def_var_String_4713: String = "cytogenetic"
    var def_var_String_4714: String = "polyphage"
    var def_var_String_4715: String = "hominoids"
    var def_var_String_4716: String = "anthologically"
    var def_var_String_4717: String = "anadenia"
    def_var_String_4712 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_4712.startsWith(def_var_String_4713)) {
            def_var_String_4712 = def_var_String_4710.substringBefore(def_var_String_4717)
        } else if (def_var_String_4712.startsWith(def_var_String_4717)) {
            def_var_String_4712 = def_var_String_4714.removePrefix(def_var_String_4710)
        } else if (def_var_String_4712.equals(def_var_String_4710)) {
            def_var_String_4712 = def_var_String_4716.substringBefore(def_var_String_4717)
        } else if (def_var_String_4712.startsWith(def_var_String_4710)) {
            def_var_String_4712 = def_var_String_4711.commonSuffixWith(def_var_String_4715)
        } else if (def_var_String_4712.contains(def_var_String_4716)) {
            def_var_String_4712 = def_var_String_4712.removePrefix(def_var_String_4713)
        } else if (def_var_String_4712.equals(def_var_String_4716)) {
            def_var_String_4712 = def_var_String_4715.commonPrefixWith(def_var_String_4711)
        } else if (def_var_String_4717.endsWith(def_var_String_4716)) {
            def_var_String_4712 = def_var_String_4711.removeSurrounding("ogdoas")
        } else if (def_var_String_4712.contains(def_var_String_4713)) {
            def_var_String_4712 = def_var_String_4714.commonSuffixWith(def_var_String_4716)
        } else if (def_var_String_4715.endsWith(def_var_String_4715)) {
            def_var_String_4712 = "bergy".commonPrefixWith("besteading")
        } else if (def_var_String_4717.contains(def_var_String_4712)) {
            def_var_String_4712 = def_var_String_4712.commonPrefixWith("hemophilia")
        } else if (def_var_String_4714.equals(def_var_String_4717)) {
            def_var_String_4712 = "maltol".substringAfter("nonconcentratiness")
        } else if (def_var_String_4717.endsWith(def_var_String_4715)) {
            def_var_String_4712 = def_var_String_4710.removePrefix("rivalry")
        } else if (def_var_String_4711.equals(def_var_String_4714)) {
            def_var_String_4712 = def_var_String_4713.substringAfter("strychnic")
        } else if (def_var_String_4717.endsWith(def_var_String_4715)) {
            def_var_String_4712 = "epopee".removePrefix("unsinking")
        } else if (def_var_String_4712.startsWith(def_var_String_4717)) {
            def_var_String_4712 = def_var_String_4710.commonPrefixWith(def_var_String_4716)
        } else {
            def_var_String_4712 = "talmudistical".commonPrefixWith(def_var_String_4717)
        }
    }
//$ def_var_String_4712

    if (def_var_String_4712.startsWith("clairseacher")) {
        return def_var_Int_4709
    }
    return -1
}

fun praepuce(def_var_Int_4718: Int): Int {
    var def_var_String_4719: String = "monkeying"
    var def_var_String_4720: String = "wotlink"
    var def_var_String_4721: String = "discontinues"
    var def_var_String_4722: String = "bewaste"
    var def_var_String_4723: String = "planktologist"
    var def_var_String_4724: String = "nonwelcome"
    var def_var_String_4725: String = "voling"
    var def_var_String_4726: String = "farstepped"
    var def_var_String_4727: String = "nonvacuousness"
    def_var_String_4719 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_4719.equals(def_var_String_4721)) {
            def_var_String_4719 = def_var_String_4726.removeSuffix(def_var_String_4722)
        } else if (def_var_String_4719.endsWith(def_var_String_4722)) {
            def_var_String_4719 = def_var_String_4723.substringAfter("butylated")
        } else if (def_var_String_4723.startsWith(def_var_String_4724)) {
            def_var_String_4719 = def_var_String_4727.removePrefix("anarcestean")
        } else if (def_var_String_4724.equals(def_var_String_4723)) {
            def_var_String_4719 = "cosmogeny".commonSuffixWith("unexplorative")
        } else if (def_var_String_4719.contains(def_var_String_4724)) {
            def_var_String_4719 = def_var_String_4722.removePrefix(def_var_String_4721)
        } else if (def_var_String_4721.endsWith(def_var_String_4725)) {
            def_var_String_4719 = def_var_String_4721.removeSuffix("misaffirm")
        } else if (def_var_String_4726.endsWith(def_var_String_4727)) {
            def_var_String_4719 = "thievishly".substringAfterLast("impactionize")
        } else if (def_var_String_4719.contains(def_var_String_4726)) {
            def_var_String_4719 = def_var_String_4719.substringAfterLast(def_var_String_4727)
        } else if (def_var_String_4725.startsWith(def_var_String_4726)) {
            def_var_String_4719 = def_var_String_4725.substringAfter("splenitive")
        } else if (def_var_String_4724.startsWith(def_var_String_4720)) {
            def_var_String_4719 = def_var_String_4725.substringAfter("indulging")
        } else if (def_var_String_4720.startsWith(def_var_String_4726)) {
            def_var_String_4719 = "benegro".substringBefore("lingtowman")
        } else if (def_var_String_4726.equals(def_var_String_4721)) {
            def_var_String_4719 = "radii".substringAfter("harmonize")
        } else if (def_var_String_4726.equals(def_var_String_4720)) {
            def_var_String_4719 = def_var_String_4720.substringAfter("ritualistic")
        } else if (def_var_String_4724.contains(def_var_String_4726)) {
            def_var_String_4719 = "lanius".substringBefore("comsomol")
        } else if (def_var_String_4722.contains(def_var_String_4720)) {
            def_var_String_4719 = def_var_String_4727.substringBeforeLast("disminister")
        } else if (def_var_String_4720.contains(def_var_String_4727)) {
            def_var_String_4719 = def_var_String_4727.substringAfterLast("dualities")
        } else if (def_var_String_4720.startsWith(def_var_String_4720)) {
            def_var_String_4719 = "diabolise".substringAfter("hypozoic")
        } else if (def_var_String_4727.equals(def_var_String_4722)) {
            def_var_String_4719 = def_var_String_4722.substringAfter("marblings")
        } else if (def_var_String_4719.contains(def_var_String_4727)) {
            def_var_String_4719 = def_var_String_4726.substringAfterLast(def_var_String_4727)
        } else if (def_var_String_4719.equals(def_var_String_4723)) {
            def_var_String_4719 = def_var_String_4719.substringBefore(def_var_String_4722)
        } else {
            def_var_String_4719 = "pentecoster".removePrefix(def_var_String_4726)
        }
    }
//$ def_var_String_4719

    if (def_var_String_4719.startsWith("libelling")) {
        return def_var_Int_4718
    }
    return -1
}

fun phyllamorph(def_var_Int_4728: Int): Int {
    var def_var_Int_4729: Int = def_var_Int_4728 * 6
    var def_var_Int_4730: Int = 2
    var def_var_Int_4731: Int = 26
    var def_var_Int_4732: Int = 13
    var def_var_Int_4733: Int = 27
    var def_var_Int_4734: Int = 7
    var def_var_Int_4735: Int = 8
    var def_var_Int_4736: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_4736 = def_var_Int_4735 % def_var_Int_4734
        def_var_Int_4736 = def_var_Int_4730 and 5
        def_var_Int_4736 = 182 and 19
        def_var_Int_4736 = 205 / 4
        def_var_Int_4736 = 310 + 13
        def_var_Int_4736 = def_var_Int_4734 and def_var_Int_4735
        def_var_Int_4736 = def_var_Int_4732 + 23
        def_var_Int_4736 = def_var_Int_4729 % def_var_Int_4735
        def_var_Int_4736 = def_var_Int_4735 * 6
        def_var_Int_4736 = def_var_Int_4731 + 22
        def_var_Int_4736 = def_var_Int_4735 / 6
        def_var_Int_4736 = 1004 and 25
        def_var_Int_4736 = def_var_Int_4730 / def_var_Int_4732
        def_var_Int_4736 = def_var_Int_4735 or def_var_Int_4731
        def_var_Int_4736 = def_var_Int_4735 % def_var_Int_4733
        def_var_Int_4736 = def_var_Int_4735 / def_var_Int_4733
        def_var_Int_4736 = def_var_Int_4731 % 8
        def_var_Int_4736 = 432 or 31
    }
    return def_var_Int_4736
}

fun isooleic(def_var_Int_4737: Int): Int {
    var def_var_String_4738: String = "leatherleaves"
    var def_var_String_4739: String = "unshrived"
    var def_var_String_4740: String = "ophir"
    var def_var_String_4741: String = "odorant"
    var def_var_String_4742: String = "nassology"
    var def_var_String_4743: String = "cathects"
    def_var_String_4743 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_4743.endsWith(def_var_String_4741)) {
            def_var_String_4743 = def_var_String_4741.substringAfterLast(def_var_String_4742)
        } else if (def_var_String_4743.startsWith(def_var_String_4739)) {
            def_var_String_4743 = def_var_String_4741.substringAfterLast(def_var_String_4742)
        } else if (def_var_String_4742.endsWith(def_var_String_4741)) {
            def_var_String_4743 = "softboard".substringBefore("reprovingly")
        } else if (def_var_String_4743.contains(def_var_String_4738)) {
            def_var_String_4743 = def_var_String_4740.substringAfterLast(def_var_String_4739)
        } else if (def_var_String_4743.contains(def_var_String_4740)) {
            def_var_String_4743 = def_var_String_4738.removeSuffix(def_var_String_4741)
        } else if (def_var_String_4743.endsWith(def_var_String_4740)) {
            def_var_String_4743 = def_var_String_4740.removeSurrounding(def_var_String_4738)
        } else if (def_var_String_4743.contains(def_var_String_4739)) {
            def_var_String_4743 = def_var_String_4743.removeSurrounding(def_var_String_4738)
        } else if (def_var_String_4743.contains(def_var_String_4738)) {
            def_var_String_4743 = def_var_String_4740.substringAfter(def_var_String_4742)
        } else if (def_var_String_4738.equals(def_var_String_4741)) {
            def_var_String_4743 = "perverting".commonSuffixWith("martyrising")
        } else if (def_var_String_4739.contains(def_var_String_4738)) {
            def_var_String_4743 = "quitterbone".substringBeforeLast("zugtierlaster")
        } else if (def_var_String_4741.contains(def_var_String_4740)) {
            def_var_String_4743 = def_var_String_4740.substringBeforeLast("ancistrodon")
        } else if (def_var_String_4742.contains(def_var_String_4739)) {
            def_var_String_4743 = "subreptary".substringAfterLast("grinderies")
        } else if (def_var_String_4740.equals(def_var_String_4742)) {
            def_var_String_4743 = def_var_String_4741.commonSuffixWith("isocheim")
        } else if (def_var_String_4740.contains(def_var_String_4743)) {
            def_var_String_4743 = def_var_String_4740.substringAfterLast("carbonizes")
        } else if (def_var_String_4741.contains(def_var_String_4742)) {
            def_var_String_4743 = def_var_String_4743.commonSuffixWith("septan")
        } else if (def_var_String_4741.contains(def_var_String_4739)) {
            def_var_String_4743 = "mawky".commonPrefixWith("smokey")
        } else if (def_var_String_4743.endsWith(def_var_String_4739)) {
            def_var_String_4743 = def_var_String_4740.removePrefix(def_var_String_4739)
        } else {
            def_var_String_4743 = "noncontumacious".substringAfterLast(def_var_String_4741)
        }
    }
//$ def_var_String_4743

    if (def_var_String_4743.contains("supercerebral")) {
        return def_var_Int_4737
    }
    return -1
}

fun amaracus(def_var_Int_4744: Int): Int {
    var def_var_String_4745: String = "unsuffering"
    var def_var_String_4746: String = "barfing"
    var def_var_String_4747: String = "diswashing"
    var def_var_String_4748: String = "surfacedly"
    var def_var_String_4749: String = "recubation"
    var def_var_String_4750: String = "swordplay"
    var def_var_String_4751: String = "chewers"
    var def_var_String_4752: String = "andromania"
    var def_var_String_4753: String = "austrogaean"
    def_var_String_4748 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_4748.startsWith(def_var_String_4752)) {
            def_var_String_4748 = def_var_String_4753.removeSurrounding(def_var_String_4752)
        } else if (def_var_String_4748.startsWith(def_var_String_4746)) {
            def_var_String_4748 = def_var_String_4747.commonPrefixWith(def_var_String_4753)
        } else if (def_var_String_4748.endsWith(def_var_String_4750)) {
            def_var_String_4748 = def_var_String_4749.commonSuffixWith(def_var_String_4746)
        } else if (def_var_String_4749.startsWith(def_var_String_4745)) {
            def_var_String_4748 = "subintelligential".removeSurrounding("devilman")
        } else if (def_var_String_4747.contains(def_var_String_4752)) {
            def_var_String_4748 = "predynastic".substringBefore("bestirs")
        } else if (def_var_String_4748.startsWith(def_var_String_4753)) {
            def_var_String_4748 = def_var_String_4745.substringAfter("testone")
        } else if (def_var_String_4748.startsWith(def_var_String_4747)) {
            def_var_String_4748 = def_var_String_4753.removeSuffix(def_var_String_4748)
        } else if (def_var_String_4746.equals(def_var_String_4749)) {
            def_var_String_4748 = "plenipotential".removePrefix("spearer")
        } else if (def_var_String_4748.contains(def_var_String_4752)) {
            def_var_String_4748 = def_var_String_4748.removeSuffix(def_var_String_4752)
        } else if (def_var_String_4746.equals(def_var_String_4751)) {
            def_var_String_4748 = "fingerstone".substringBefore("discomedusoid")
        } else if (def_var_String_4751.equals(def_var_String_4745)) {
            def_var_String_4748 = def_var_String_4753.removePrefix("scrams")
        } else {
            def_var_String_4748 = "brigued".substringBeforeLast(def_var_String_4750)
        }
    }
//$ def_var_String_4748

    if (def_var_String_4748.contains("ordinance")) {
        return def_var_Int_4744
    }
    return -1
}

fun salons(def_var_Int_4754: Int): Int {//Function call
    var def_var_Int_4755: Int = 215
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_4755 = praepuce(429) / aggrandizement(def_var_Int_4755)
        def_var_Int_4755 = amaracus(853)
        def_var_Int_4755 = phyllamorph(1013) * borgh(def_var_Int_4755)
        def_var_Int_4755 = phyllamorph(def_var_Int_4755)
        def_var_Int_4755 = sturtin(def_var_Int_4754)
        def_var_Int_4755 = sturtin(818) - phyllamorph(def_var_Int_4755)
        def_var_Int_4755 = abasias(312) xor aggrandizement(def_var_Int_4755)
        def_var_Int_4755 = abasias(def_var_Int_4754)
        def_var_Int_4755 = lobbyists(def_var_Int_4754)
        def_var_Int_4755 = amaracus(4) % lobbyists(def_var_Int_4755)
        def_var_Int_4755 = descried(136) + praepuce(def_var_Int_4755)
        def_var_Int_4755 = nudifier(240) / aggrandizement(def_var_Int_4755)
        def_var_Int_4755 = lobbyists(def_var_Int_4754)
        def_var_Int_4755 = phyllamorph(154) xor isooleic(def_var_Int_4755)
    }
    return def_var_Int_4755
}

fun endaortic(def_var_Int_4756: Int): Int {//Function call(fork)
    var def_var_Int_4757: Int = 452
    if (System.currentTimeMillis().toInt() == 0) {
        if (nudifier(def_var_Int_4757) == 85) {
        } else if (isooleic(def_var_Int_4757) > praepuce(354)) {
            def_var_Int_4757 = abasias(def_var_Int_4757)
        } else if (salons(def_var_Int_4757) > praepuce(692)) {
            def_var_Int_4757 = abasias(def_var_Int_4757)
        } else if (aggrandizement(def_var_Int_4757) != 400) {
            def_var_Int_4757 = descried(165)
        } else if (salons(def_var_Int_4757) == sturtin(334)) {
            def_var_Int_4757 = phyllamorph(def_var_Int_4757)
        } else if (amaracus(def_var_Int_4757) == 624) {
            def_var_Int_4757 = nudifier(1004)
        } else if (aggrandizement(def_var_Int_4757) >= praepuce(650)) {
            def_var_Int_4757 = sturtin(def_var_Int_4757)
        } else if (abasias(def_var_Int_4757) >= salons(409)) {
            def_var_Int_4757 = praepuce(def_var_Int_4757)
            def_var_Int_4757 = praepuce(def_var_Int_4757) xor phyllamorph(def_var_Int_4757)
        } else if (aggrandizement(def_var_Int_4757) <= 227) {
            def_var_Int_4757 = sturtin(401)
        } else if (salons(def_var_Int_4757) > 699) {
            def_var_Int_4757 = descried(795)
        } else if (phyllamorph(def_var_Int_4757) >= 312) {
            def_var_Int_4757 = descried(164)
        } else if (aggrandizement(def_var_Int_4757) != descried(507)) {
            def_var_Int_4757 = aggrandizement(def_var_Int_4757)
        } else {
            def_var_Int_4757 = abasias(def_var_Int_4757)
        }
    }
    return def_var_Int_4757
}

var def_var_Boolean_4758: Boolean = true
fun getnoticed(): Boolean {
    return def_var_Boolean_4758
}

fun setdeadmelt(def_var_Boolean_4759: Boolean) {
    def_var_Boolean_4758 = def_var_Boolean_4759
}

var def_var_Int_4763: Int = 115
fun getstockcar(): Int {
    return def_var_Int_4763
}

fun setantisex(def_var_Int_4764: Int) {
    def_var_Int_4763 = def_var_Int_4764
}

var def_var_Long_4765: Long = 763
fun getjehu(): Long {
    return def_var_Long_4765
}

fun setdisorderly(def_var_Long_4766: Long) {
    def_var_Long_4765 = def_var_Long_4766
}

var def_var_Double_4768: Double = 302.0
fun getstandergrass(): Double {
    return def_var_Double_4768
}

fun setstruthionine(def_var_Double_4769: Double) {
    def_var_Double_4768 = def_var_Double_4769
}

var def_var_String_4770: String = "chalana"
fun getpenury(): String {
    return def_var_String_4770
}

fun setquintuplicating(def_var_String_4771: String) {
    def_var_String_4770 = def_var_String_4771
}


/**
 * Date：2024/4/1
 * Describe:
 */
class BRoomImpl(val context: Context) {

    companion object {

        fun roomR() {
            var def_var_String_4773: String = "bysacki"
            var def_var_String_4774: String = "amebiform"
            var def_var_String_4775: String = "perhazard"
            var def_var_String_4776: String = "klootchman"
            var def_var_String_4777: String = "regiving"
            def_var_String_4773 = Math.random().toString()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_String_4773.equals(def_var_String_4777)) {
                    def_var_String_4773 = def_var_String_4776.commonSuffixWith(def_var_String_4775)
                } else if (def_var_String_4773.endsWith(def_var_String_4776)) {
                    def_var_String_4773 = def_var_String_4773.removeSurrounding(def_var_String_4776)
                } else if (def_var_String_4773.endsWith(def_var_String_4774)) {
                    def_var_String_4773 = def_var_String_4775.substringAfter(def_var_String_4773)
                } else if (def_var_String_4773.contains(def_var_String_4774)) {
                    def_var_String_4773 =
                        def_var_String_4775.substringAfterLast(def_var_String_4777)
                } else if (def_var_String_4776.equals(def_var_String_4776)) {
                    def_var_String_4773 = "habitancy".commonPrefixWith("histiophoridae")
                } else if (def_var_String_4774.startsWith(def_var_String_4777)) {
                    def_var_String_4773 = "saintology".removePrefix("minimifidian")
                } else if (def_var_String_4775.endsWith(def_var_String_4773)) {
                    def_var_String_4773 = def_var_String_4777.removeSuffix("surmit")
                } else if (def_var_String_4777.equals(def_var_String_4777)) {
                    def_var_String_4773 = "plumulose".substringBefore("hesperis")
                } else if (def_var_String_4774.contains(def_var_String_4773)) {
                    def_var_String_4773 = def_var_String_4776.substringBefore("klongs")
                } else if (def_var_String_4774.contains(def_var_String_4773)) {
                    def_var_String_4773 = def_var_String_4777.substringBefore("ultraspartan")
                } else if (def_var_String_4777.startsWith(def_var_String_4776)) {
                    def_var_String_4773 = "fenestrate".substringBefore("trichophore")
                } else if (def_var_String_4777.startsWith(def_var_String_4774)) {
                    def_var_String_4773 = "vellums".removePrefix("autogenously")
                } else if (def_var_String_4773.startsWith(def_var_String_4777)) {
                    def_var_String_4773 = def_var_String_4777.removeSurrounding(def_var_String_4774)
                } else if (def_var_String_4774.endsWith(def_var_String_4775)) {
                    def_var_String_4773 = "chronicled".substringBeforeLast("unparalyzed")
                } else if (def_var_String_4777.endsWith(def_var_String_4775)) {
                    def_var_String_4773 = "salsifies".commonPrefixWith("boviculture")
                } else {
                    def_var_String_4773 = "familic".substringBefore(def_var_String_4777)
                }
            }
//$ def_var_String_4773

            Adjust.onResume()
        }

        fun roomClose() {
            var def_var_Int_4778: Int = 31
            var def_var_Int_4779: Int = 27
            var def_var_Int_4780: Int = 5
            var def_var_Int_4781: Int = 14
            var def_var_Int_4782: Int = 30
            var def_var_Int_4783: Int = 22
            var def_var_Int_4784: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_4784 = def_var_Int_4780 and def_var_Int_4781
                def_var_Int_4784 = def_var_Int_4780 - 13
                def_var_Int_4784 = def_var_Int_4778 % def_var_Int_4779
                def_var_Int_4784 = def_var_Int_4779 or def_var_Int_4783
                def_var_Int_4784 = def_var_Int_4780 xor 30
                def_var_Int_4784 = def_var_Int_4779 or def_var_Int_4783
                def_var_Int_4784 = def_var_Int_4780 xor def_var_Int_4779
                def_var_Int_4784 = 532 + 4
                def_var_Int_4784 = def_var_Int_4783 and def_var_Int_4779
                def_var_Int_4784 = 290 / 14
                def_var_Int_4784 = def_var_Int_4778 - 27
                def_var_Int_4784 = def_var_Int_4782 and 15
                def_var_Int_4784 = def_var_Int_4781 and 25
                def_var_Int_4784 = def_var_Int_4780 / 10
                def_var_Int_4784 = def_var_Int_4779 or 11
                def_var_Int_4784 = def_var_Int_4781 + def_var_Int_4783
            }
//$ def_var_Int_4784

            Adjust.onPause()
        }
    }

    private val okHttpClient = OkHttpClient()

    fun roomBedS() {
        var def_var_Long_4785: Long = System.currentTimeMillis()
        var def_var_Long_4786: Long = def_var_Long_4785 * 19
        var def_var_Long_4787: Long = def_var_Long_4786 xor 23
        var def_var_Long_4788: Long = def_var_Long_4785 and 24
        var def_var_Long_4789: Long = def_var_Long_4785 / 13
        var def_var_Long_4790: Long = def_var_Long_4785 xor 16
        def_var_Long_4785 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_4785 < def_var_Long_4786) {
                def_var_Long_4785 = def_var_Long_4789 + def_var_Long_4786
            } else if (521.toLong() != def_var_Long_4789) {
                def_var_Long_4785 = 1012 % 3
            } else if (26.toLong() == def_var_Long_4788) {
                def_var_Long_4785 = 74 % 11
            } else if (662.toLong() != def_var_Long_4790) {
                def_var_Long_4785 = 588 / 4
            } else if (def_var_Long_4785 <= def_var_Long_4786) {
                def_var_Long_4785 = def_var_Long_4785 - def_var_Long_4789
            } else if (def_var_Long_4785 == def_var_Long_4787) {
                def_var_Long_4785 = def_var_Long_4790 xor def_var_Long_4787
            } else if (750.toLong() != def_var_Long_4790) {
                def_var_Long_4785 = 856 + 7
            } else if (def_var_Long_4785 <= def_var_Long_4789) {
                def_var_Long_4785 = def_var_Long_4788 + def_var_Long_4789
            } else if (def_var_Long_4785 <= def_var_Long_4790) {
                def_var_Long_4785 = def_var_Long_4788 xor def_var_Long_4790
            } else if (def_var_Long_4787 <= def_var_Long_4788) {
                def_var_Long_4785 = def_var_Long_4786 * 25
            } else if (def_var_Long_4790 <= def_var_Long_4786) {
                def_var_Long_4785 = def_var_Long_4786 - 29
            } else if (174.toLong() != def_var_Long_4787) {
                def_var_Long_4785 = 454 or 9
            } else if (def_var_Long_4785 != def_var_Long_4790) {
                def_var_Long_4785 = def_var_Long_4790 - def_var_Long_4787
            } else if (def_var_Long_4785 > def_var_Long_4790) {
                def_var_Long_4785 = def_var_Long_4786 and def_var_Long_4787
            } else if (840.toLong() >= def_var_Long_4787) {
                def_var_Long_4785 = 494 and 17
            } else if (def_var_Long_4785 <= def_var_Long_4789) {
                def_var_Long_4785 = def_var_Long_4786 or 19
            } else if (def_var_Long_4789 <= def_var_Long_4787) {
                def_var_Long_4785 = def_var_Long_4787 or 28
            } else {
                def_var_Long_4785 = 742.toLong() % def_var_Long_4788
            }
        }
//$ def_var_Long_4785.toInt()

        val environment =
            if (BuildConfig.DEBUG) AdjustConfig.ENVIRONMENT_SANDBOX else AdjustConfig.ENVIRONMENT_PRODUCTION
        //todo modify adjust key
        val config = AdjustConfig(context, "ih2pm2dr3k74", environment)
        Adjust.addSessionCallbackParameter("customer_user_id", FloorCache.mDisIdS)

        config.setOnAttributionChangedListener {
            var def_var_String_4791: String = "glossaries"
            var def_var_String_4792: String = "bodhi"
            var def_var_String_4793: String = "quinamidine"
            var def_var_String_4794: String = "capoche"
            var def_var_String_4795: String = "cycledom"
            var def_var_String_4796: String = "cerias"
            var def_var_String_4797: String = "ultrasubtle"
            var def_var_String_4798: String = "unnotionally"
            def_var_String_4796 = Math.random().toString()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_String_4796.endsWith(def_var_String_4795)) {
                    def_var_String_4796 = def_var_String_4793.removeSurrounding(def_var_String_4795)
                } else if (def_var_String_4796.equals(def_var_String_4792)) {
                    def_var_String_4796 = def_var_String_4795.substringAfter(def_var_String_4797)
                } else if (def_var_String_4795.endsWith(def_var_String_4798)) {
                    def_var_String_4796 = def_var_String_4791.removeSuffix("filmslide")
                } else if (def_var_String_4792.contains(def_var_String_4791)) {
                    def_var_String_4796 = def_var_String_4794.substringAfterLast("liquidization")
                } else if (def_var_String_4796.equals(def_var_String_4792)) {
                    def_var_String_4796 = def_var_String_4794.substringAfter(def_var_String_4798)
                } else if (def_var_String_4794.equals(def_var_String_4795)) {
                    def_var_String_4796 = "stratified".substringAfter("balaklava")
                } else if (def_var_String_4791.startsWith(def_var_String_4797)) {
                    def_var_String_4796 = def_var_String_4793.commonSuffixWith("goings")
                } else if (def_var_String_4796.endsWith(def_var_String_4794)) {
                    def_var_String_4796 = def_var_String_4793.removeSuffix("autobiographically")
                } else if (def_var_String_4796.startsWith(def_var_String_4795)) {
                    def_var_String_4796 =
                        def_var_String_4794.substringAfterLast(def_var_String_4795)
                } else if (def_var_String_4796.startsWith(def_var_String_4795)) {
                    def_var_String_4796 = def_var_String_4796.substringBefore(def_var_String_4795)
                } else if (def_var_String_4796.endsWith(def_var_String_4793)) {
                    def_var_String_4796 =
                        def_var_String_4798.substringBeforeLast(def_var_String_4793)
                } else if (def_var_String_4794.equals(def_var_String_4794)) {
                    def_var_String_4796 = "rejerk".substringBefore("paleoentomological")
                } else if (def_var_String_4795.endsWith(def_var_String_4792)) {
                    def_var_String_4796 = def_var_String_4794.removeSurrounding("bainie")
                } else if (def_var_String_4796.startsWith(def_var_String_4793)) {
                    def_var_String_4796 = def_var_String_4791.substringAfter(def_var_String_4796)
                } else if (def_var_String_4796.startsWith(def_var_String_4793)) {
                    def_var_String_4796 = def_var_String_4793.removeSuffix(def_var_String_4795)
                } else if (def_var_String_4793.endsWith(def_var_String_4796)) {
                    def_var_String_4796 = def_var_String_4798.substringBeforeLast("bowe")
                } else if (def_var_String_4795.endsWith(def_var_String_4797)) {
                    def_var_String_4796 = def_var_String_4792.commonSuffixWith("seawoman")
                } else if (def_var_String_4797.startsWith(def_var_String_4792)) {
                    def_var_String_4796 = def_var_String_4793.commonPrefixWith("piano")
                } else if (def_var_String_4796.startsWith(def_var_String_4794)) {
                    def_var_String_4796 = def_var_String_4798.removeSurrounding("swizzler")
                } else if (def_var_String_4792.startsWith(def_var_String_4791)) {
                    def_var_String_4796 = def_var_String_4797.removeSuffix("benzdiazine")
                } else {
                    def_var_String_4796 = "jackyarder".commonPrefixWith(def_var_String_4793)
                }
            }
//$ def_var_String_4796

//            DoorLog.go("setOnAttributionChangedListener--->${it.network}")
            if (FloorCache.isRoomAdj().not()) {
                var def_var_String_4799: String = ""
                var def_var_Double_4800: Double = Math.random()
                if ((320.0 - getstandergrass()) > 0.0) {
                    setstruthionine(getstandergrass() + def_var_Double_4800)
                    if ((719.0 - def_var_Double_4800) > 0.0) {
                        setdeadmelt(Math.random() > 0.5)
                        def_var_String_4799 = Math.random().toString()
                    } else {
                        setdeadmelt(Math.random() > 0.5)
                        def_var_String_4799 = Math.random().toString()
                    }
                } else if ((getjehu() - 45) > 0) {
                    def_var_Double_4800 = Math.random()
                    if ((441.0 - def_var_Double_4800) > 0.0) {
                        def_var_Double_4800 = 512.toDouble()
                    } else if ((899.0 - def_var_Double_4800) > 0.0) {
                        def_var_Double_4800 = 271.toDouble()
                    } else if ((583.0 - def_var_Double_4800) > 0.0) {
                        def_var_Double_4800 = 140.toDouble()
                    } else {
                        def_var_Double_4800 = 821.toDouble()
                    }
                    setstruthionine(def_var_Double_4800)
                    def_var_String_4799 = Math.random().toString()
                }
                setquintuplicating(def_var_String_4799)

                val network = it.network
                if (network.isNotBlank()) {
                    var def_var_Long_4801: Long = System.currentTimeMillis()
                    var def_var_Long_4802: Long = def_var_Long_4801 xor 16
                    var def_var_Long_4803: Long = def_var_Long_4801 - 14
                    var def_var_Long_4804: Long = def_var_Long_4801 % 31
                    var def_var_Long_4805: Long = def_var_Long_4802 % 20
                    def_var_Long_4804 = System.currentTimeMillis()
                    if (System.currentTimeMillis().toInt() == 0) {
                        if (def_var_Long_4804 < def_var_Long_4801) {
                            def_var_Long_4804 = def_var_Long_4801 xor def_var_Long_4805
                        } else if (def_var_Long_4803 == def_var_Long_4801) {
                            def_var_Long_4804 = def_var_Long_4801 * 11
                        } else if (def_var_Long_4804 <= def_var_Long_4803) {
                            def_var_Long_4804 = def_var_Long_4805 - def_var_Long_4804
                        } else if (130.toLong() <= def_var_Long_4802) {
                            def_var_Long_4804 = 1008 + 15
                        } else if (76.toLong() > def_var_Long_4805) {
                            def_var_Long_4804 = 812 - 7
                        } else if (def_var_Long_4803 != def_var_Long_4804) {
                            def_var_Long_4804 = def_var_Long_4804 - 5
                        } else if (226.toLong() > def_var_Long_4802) {
                            def_var_Long_4804 = 559 * 26
                        } else if (def_var_Long_4804 >= def_var_Long_4805) {
                            def_var_Long_4804 = def_var_Long_4805 xor def_var_Long_4803
                        } else if (def_var_Long_4804 > def_var_Long_4801) {
                            def_var_Long_4804 = def_var_Long_4801 and def_var_Long_4805
                        } else if (def_var_Long_4804 < def_var_Long_4801) {
                            def_var_Long_4804 = def_var_Long_4802 * def_var_Long_4805
                        } else if (172.toLong() != def_var_Long_4805) {
                            def_var_Long_4804 = 811 xor 8
                        } else if (605.toLong() >= def_var_Long_4802) {
                            def_var_Long_4804 = 897 * 17
                        } else if (def_var_Long_4804 > def_var_Long_4802) {
                            def_var_Long_4804 = def_var_Long_4803 * def_var_Long_4805
                        } else if (588.toLong() < def_var_Long_4801) {
                            def_var_Long_4804 = 432 * 13
                        } else if (def_var_Long_4805 == def_var_Long_4802) {
                            def_var_Long_4804 = def_var_Long_4804 xor 13
                        } else if (def_var_Long_4801 > def_var_Long_4803) {
                            def_var_Long_4804 = def_var_Long_4802 - 1
                        } else {
                            def_var_Long_4804 = 510.toLong() + def_var_Long_4805
                        }
                    }
//$ def_var_Long_4804.toInt()

                    FloorCache.mRoomNetwork = network
                    FloorCache.isRoomAdj(true)
                }
            }
        }

        Adjust.onCreate(config)

        bedRoomStar()
    }


    private fun bedRoomStar() {
        var def_var_String_4806: String = "masquerades"
        var def_var_String_4807: String = "flapperish"
        var def_var_String_4808: String = "unland"
        var def_var_String_4809: String = "gastrorrhagia"
        var def_var_String_4810: String = "strumaticness"
        var def_var_String_4811: String = "shevel"
        var def_var_String_4812: String = "deviates"
        var def_var_String_4813: String = "staroobriadtsi"
        var def_var_String_4814: String = "merchantability"
        def_var_String_4811 = Math.random().toString()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_String_4811.startsWith(def_var_String_4814)) {
                def_var_String_4811 = def_var_String_4809.removeSurrounding(def_var_String_4811)
            } else if (def_var_String_4814.startsWith(def_var_String_4814)) {
                def_var_String_4811 = "mahran".removeSuffix("horatian")
            } else if (def_var_String_4811.contains(def_var_String_4814)) {
                def_var_String_4811 = def_var_String_4811.substringAfter(def_var_String_4814)
            } else if (def_var_String_4814.endsWith(def_var_String_4807)) {
                def_var_String_4811 = "unfortunately".removePrefix("phenogenetic")
            } else if (def_var_String_4808.startsWith(def_var_String_4807)) {
                def_var_String_4811 = def_var_String_4813.substringBefore("flocced")
            } else if (def_var_String_4813.contains(def_var_String_4814)) {
                def_var_String_4811 = "pitting".substringBefore("quet")
            } else if (def_var_String_4810.equals(def_var_String_4807)) {
                def_var_String_4811 = def_var_String_4809.substringBefore("nesosilicate")
            } else if (def_var_String_4813.equals(def_var_String_4806)) {
                def_var_String_4811 = def_var_String_4814.removeSurrounding("misidentifies")
            } else if (def_var_String_4809.startsWith(def_var_String_4813)) {
                def_var_String_4811 = "bibliomanism".commonSuffixWith("misappropriately")
            } else if (def_var_String_4809.startsWith(def_var_String_4806)) {
                def_var_String_4811 = "reword".removeSuffix("isotonia")
            } else if (def_var_String_4806.startsWith(def_var_String_4810)) {
                def_var_String_4811 = "sapbush".substringBefore("noninhibitive")
            } else if (def_var_String_4808.contains(def_var_String_4810)) {
                def_var_String_4811 = def_var_String_4807.substringAfter("piroplasmosis")
            } else if (def_var_String_4813.startsWith(def_var_String_4809)) {
                def_var_String_4811 = "bouillone".commonSuffixWith("opiniated")
            } else if (def_var_String_4811.endsWith(def_var_String_4814)) {
                def_var_String_4811 = def_var_String_4811.substringBeforeLast(def_var_String_4806)
            } else {
                def_var_String_4811 = "phosphoglycoprotein".substringBefore(def_var_String_4808)
            }
        }
//$ def_var_String_4811

        if (FloorCache.colSbed.isNotBlank()) return
        DoorLog.go("bedRoomStar --->")
        okHttpClient.newCall(getRequest()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                var def_var_Long_4815: Long = System.currentTimeMillis()
                var def_var_Long_4816: Long = def_var_Long_4815 xor 28
                var def_var_Long_4817: Long = def_var_Long_4816 or 23
                var def_var_Long_4818: Long = def_var_Long_4815 - 21
                var def_var_Long_4819: Long = def_var_Long_4818 / 24
                var def_var_Long_4820: Long = def_var_Long_4815 xor 28
                var def_var_Long_4821: Long = def_var_Long_4819 + 8
                def_var_Long_4815 = System.currentTimeMillis()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_Long_4815 >= def_var_Long_4816) {
                        def_var_Long_4815 = def_var_Long_4816 + def_var_Long_4819
                    } else if (271.toLong() != def_var_Long_4816) {
                        def_var_Long_4815 = 726 / 25
                    } else if (def_var_Long_4820 == def_var_Long_4817) {
                        def_var_Long_4815 = def_var_Long_4821 + 6
                    } else if (def_var_Long_4815 > def_var_Long_4818) {
                        def_var_Long_4815 = def_var_Long_4815 * def_var_Long_4819
                    } else if (309.toLong() == def_var_Long_4820) {
                        def_var_Long_4815 = 833 xor 10
                    } else if (207.toLong() == def_var_Long_4817) {
                        def_var_Long_4815 = 255 xor 1
                    } else if (def_var_Long_4815 > def_var_Long_4816) {
                        def_var_Long_4815 = def_var_Long_4818 + def_var_Long_4815
                    } else if (750.toLong() == def_var_Long_4821) {
                        def_var_Long_4815 = 866 and 6
                    } else if (1005.toLong() > def_var_Long_4816) {
                        def_var_Long_4815 = 93 or 27
                    } else if (79.toLong() > def_var_Long_4816) {
                        def_var_Long_4815 = 121 % 16
                    } else if (102.toLong() < def_var_Long_4818) {
                        def_var_Long_4815 = 1020 or 17
                    } else if (def_var_Long_4820 != def_var_Long_4816) {
                        def_var_Long_4815 = def_var_Long_4816 and 8
                    } else if (def_var_Long_4815 != def_var_Long_4818) {
                        def_var_Long_4815 = def_var_Long_4816 and def_var_Long_4820
                    } else if (def_var_Long_4815 != def_var_Long_4816) {
                        def_var_Long_4815 = def_var_Long_4821 or def_var_Long_4817
                    } else if (def_var_Long_4815 != def_var_Long_4818) {
                        def_var_Long_4815 = def_var_Long_4818 / def_var_Long_4821
                    } else if (def_var_Long_4820 != def_var_Long_4816) {
                        def_var_Long_4815 = def_var_Long_4820 / 16
                    } else if (def_var_Long_4820 == def_var_Long_4819) {
                        def_var_Long_4815 = def_var_Long_4816 xor 16
                    } else if (def_var_Long_4821 >= def_var_Long_4815) {
                        def_var_Long_4815 = def_var_Long_4820 - 6
                    } else if (def_var_Long_4815 > def_var_Long_4818) {
                        def_var_Long_4815 = def_var_Long_4820 and def_var_Long_4817
                    } else if (def_var_Long_4821 < def_var_Long_4820) {
                        def_var_Long_4815 = def_var_Long_4817 and 24
                    } else {
                        def_var_Long_4815 = 538.toLong() - def_var_Long_4817
                    }
                }
//$ def_var_Long_4815.toInt()

                e.printStackTrace()
            }

            override fun onResponse(call: Call, response: Response) {
                var def_var_Long_4822: Long = System.currentTimeMillis()
                var def_var_Long_4823: Long = def_var_Long_4822 + 5
                var def_var_Long_4824: Long = def_var_Long_4822 + 16
                var def_var_Long_4825: Long = def_var_Long_4824 / 10
                var def_var_Long_4826: Long = def_var_Long_4822 and 13
                def_var_Long_4822 = System.currentTimeMillis()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_Long_4822 == def_var_Long_4823) {
                        def_var_Long_4822 = def_var_Long_4826 or def_var_Long_4825
                    } else if (def_var_Long_4822 < def_var_Long_4825) {
                        def_var_Long_4822 = def_var_Long_4823 xor def_var_Long_4824
                    } else if (104.toLong() == def_var_Long_4825) {
                        def_var_Long_4822 = 334 or 1
                    } else if (419.toLong() <= def_var_Long_4825) {
                        def_var_Long_4822 = 89 / 26
                    } else if (def_var_Long_4822 == def_var_Long_4825) {
                        def_var_Long_4822 = def_var_Long_4824 * def_var_Long_4826
                    } else if (17.toLong() <= def_var_Long_4823) {
                        def_var_Long_4822 = 596 xor 4
                    } else if (def_var_Long_4826 > def_var_Long_4822) {
                        def_var_Long_4822 = def_var_Long_4823 * 26
                    } else if (69.toLong() > def_var_Long_4823) {
                        def_var_Long_4822 = 349 - 15
                    } else if (def_var_Long_4825 <= def_var_Long_4822) {
                        def_var_Long_4822 = def_var_Long_4823 / 29
                    } else if (def_var_Long_4822 <= def_var_Long_4823) {
                        def_var_Long_4822 = def_var_Long_4825 + def_var_Long_4822
                    } else if (def_var_Long_4822 >= def_var_Long_4824) {
                        def_var_Long_4822 = def_var_Long_4824 xor def_var_Long_4822
                    } else {
                        def_var_Long_4822 = 91.toLong() + def_var_Long_4826
                    }
                }
//$ def_var_Long_4822.toInt()

                val body = response.body?.string() ?: ""
                DoorLog.go("--->$body")
                if (response.isSuccessful && response.code == 200) {
                    var def_var_Int_4827: Int = 16
                    var def_var_Int_4828: Int = 16
                    var def_var_Int_4829: Int = 24
                    var def_var_Int_4830: Int = 29
                    var def_var_Int_4831: Int = 22
                    var def_var_Int_4832: Int = 19
                    var def_var_Int_4833: Int = 17
                    var def_var_Int_4834: Int = 19
                    var def_var_Int_4835: Int = 6
                    var def_var_Int_4836: Int = 0
                    if (System.currentTimeMillis().toInt() == 0) {
                        def_var_Int_4836 = def_var_Int_4827 * 20
                        def_var_Int_4836 = 171 - 6
                        def_var_Int_4836 = def_var_Int_4835 / 16
                        def_var_Int_4836 = 870 % 13
                        def_var_Int_4836 = 1001 / 28
                        def_var_Int_4836 = def_var_Int_4831 - def_var_Int_4830
                        def_var_Int_4836 = 980 * 30
                        def_var_Int_4836 = def_var_Int_4833 * def_var_Int_4827
                        def_var_Int_4836 = def_var_Int_4834 + def_var_Int_4827
                        def_var_Int_4836 = 899 / 21
                        def_var_Int_4836 = def_var_Int_4827 and 6
                        def_var_Int_4836 = def_var_Int_4829 - def_var_Int_4832
                        def_var_Int_4836 = def_var_Int_4833 + 2
                        def_var_Int_4836 = def_var_Int_4830 + def_var_Int_4827
                        def_var_Int_4836 = def_var_Int_4827 / 28
                    }
//$ def_var_Int_4836

                    FloorCache.colSbed = body
                }
            }
        })


        CoroutineScope(Dispatchers.IO).launch {
            delay(8941)
            bedRoomStar()
        }
    }

    private val BAS_ROOM_U = "https://asilomar.sassygirlswallpaper.com/fallen/brewster"
    private fun getRequest(): Request {
        var def_var_Long_4839: Long = System.currentTimeMillis()
        var def_var_Long_4840: Long = def_var_Long_4839 * 23
        var def_var_Long_4841: Long = def_var_Long_4840 and 8
        var def_var_Long_4842: Long = def_var_Long_4839 and 2
        var def_var_Long_4843: Long = def_var_Long_4841 or 23
        def_var_Long_4843 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_4843 <= def_var_Long_4839) {
                def_var_Long_4843 = def_var_Long_4842 or def_var_Long_4840
            } else if (def_var_Long_4841 == def_var_Long_4839) {
                def_var_Long_4843 = def_var_Long_4839 % 19
            } else if (def_var_Long_4842 < def_var_Long_4840) {
                def_var_Long_4843 = def_var_Long_4839 * 8
            } else if (def_var_Long_4843 == def_var_Long_4842) {
                def_var_Long_4843 = def_var_Long_4843 / 4
            } else if (573.toLong() >= def_var_Long_4839) {
                def_var_Long_4843 = 490 or 15
            } else if (def_var_Long_4843 == def_var_Long_4840) {
                def_var_Long_4843 = def_var_Long_4839 xor def_var_Long_4841
            } else if (94.toLong() <= def_var_Long_4840) {
                def_var_Long_4843 = 499 + 3
            } else if (def_var_Long_4843 >= def_var_Long_4842) {
                def_var_Long_4843 = def_var_Long_4841 and 8
            } else if (def_var_Long_4843 > def_var_Long_4839) {
                def_var_Long_4843 = def_var_Long_4841 or def_var_Long_4842
            } else if (def_var_Long_4839 != def_var_Long_4841) {
                def_var_Long_4843 = def_var_Long_4843 / 26
            } else if (768.toLong() > def_var_Long_4839) {
                def_var_Long_4843 = 212 / 24
            } else if (def_var_Long_4843 < def_var_Long_4840) {
                def_var_Long_4843 = def_var_Long_4841 and def_var_Long_4839
            } else if (def_var_Long_4840 == def_var_Long_4843) {
                def_var_Long_4843 = def_var_Long_4843 / 3
            } else if (def_var_Long_4843 != def_var_Long_4839) {
                def_var_Long_4843 = def_var_Long_4841 and def_var_Long_4843
            } else {
                def_var_Long_4843 = 300.toLong() and def_var_Long_4839
            }
        }
//$ def_var_Long_4843.toInt()

        fun getU(): String {
            var def_var_Long_4844: Long = System.currentTimeMillis()
            var def_var_Long_4845: Long = def_var_Long_4844 * 23
            var def_var_Long_4846: Long = def_var_Long_4844 * 12
            var def_var_Long_4847: Long = def_var_Long_4845 and 8
            var def_var_Long_4848: Long = def_var_Long_4845 and 23
            var def_var_Long_4849: Long = def_var_Long_4847 xor 17
            var def_var_Long_4850: Long = def_var_Long_4849 or 25
            def_var_Long_4847 = System.currentTimeMillis()
            if (System.currentTimeMillis().toInt() == 0) {
                if (def_var_Long_4847 <= def_var_Long_4845) {
                    def_var_Long_4847 = def_var_Long_4847 or def_var_Long_4848
                } else if (570.toLong() > def_var_Long_4850) {
                    def_var_Long_4847 = 4 - 28
                } else if (def_var_Long_4847 >= def_var_Long_4849) {
                    def_var_Long_4847 = def_var_Long_4847 * def_var_Long_4845
                } else if (def_var_Long_4847 < def_var_Long_4844) {
                    def_var_Long_4847 = def_var_Long_4848 - def_var_Long_4850
                } else if (def_var_Long_4850 >= def_var_Long_4846) {
                    def_var_Long_4847 = def_var_Long_4849 or 14
                } else if (def_var_Long_4847 > def_var_Long_4844) {
                    def_var_Long_4847 = def_var_Long_4845 / def_var_Long_4850
                } else if (678.toLong() <= def_var_Long_4844) {
                    def_var_Long_4847 = 559 and 17
                } else if (def_var_Long_4847 != def_var_Long_4844) {
                    def_var_Long_4847 = def_var_Long_4844 and 24
                } else if (def_var_Long_4847 == def_var_Long_4850) {
                    def_var_Long_4847 = def_var_Long_4844 % def_var_Long_4847
                } else if (def_var_Long_4845 == def_var_Long_4847) {
                    def_var_Long_4847 = def_var_Long_4846 % 8
                } else if (840.toLong() >= def_var_Long_4846) {
                    def_var_Long_4847 = 23 / 21
                } else if (def_var_Long_4847 > def_var_Long_4845) {
                    def_var_Long_4847 = def_var_Long_4846 - def_var_Long_4845
                } else if (def_var_Long_4847 < def_var_Long_4845) {
                    def_var_Long_4847 = def_var_Long_4848 % def_var_Long_4849
                } else {
                    def_var_Long_4847 = 877.toLong() or def_var_Long_4849
                }
            }
//$ def_var_Long_4847.toInt()

            return "$BAS_ROOM_U?gilbert=${FloorCache.mDisIdS}&been=${System.currentTimeMillis()}&quell=${Build.MODEL}&rosen=${getRosen()}" + "&supple=${Build.VERSION.RELEASE}&sylvania=${FloorCache.mFloorGid}&slick=${FloorCache.mAndFloorId}" + "&take=vee&reek=${FloorCache.floorVer}"
        }
        return Request.Builder().url(getU()).get().build()
    }

    private fun getRosen(): String {
        var def_var_String_4851: String = "subinflammatory"
        var def_var_String_4852: String = "bacillicidal"
        var def_var_String_4853: String = "tremellaceous"
        var def_var_String_4854: String = "anaphoric"
        var def_var_String_4855: String = "plupatriotic"
        var def_var_String_4856: String = "nonseasonable"
        var def_var_String_4857: String = "poundbreach"
        def_var_String_4851 = Math.random().toString()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_String_4851.endsWith(def_var_String_4855)) {
                def_var_String_4851 = def_var_String_4856.removePrefix(def_var_String_4855)
            } else if (def_var_String_4851.contains(def_var_String_4855)) {
                def_var_String_4851 = def_var_String_4855.commonPrefixWith(def_var_String_4857)
            } else if (def_var_String_4854.endsWith(def_var_String_4857)) {
                def_var_String_4851 = "hallow".substringAfter("orismological")
            } else if (def_var_String_4857.endsWith(def_var_String_4853)) {
                def_var_String_4851 = "nonnocturnally".removeSuffix("camerlingos")
            } else if (def_var_String_4852.contains(def_var_String_4855)) {
                def_var_String_4851 = "deliveress".substringAfterLast("assertrix")
            } else if (def_var_String_4851.endsWith(def_var_String_4856)) {
                def_var_String_4851 = def_var_String_4854.commonPrefixWith(def_var_String_4856)
            } else if (def_var_String_4854.contains(def_var_String_4857)) {
                def_var_String_4851 = "subvaluation".removePrefix("pollinoid")
            } else if (def_var_String_4851.endsWith(def_var_String_4853)) {
                def_var_String_4851 = def_var_String_4857.removePrefix(def_var_String_4856)
            } else if (def_var_String_4857.startsWith(def_var_String_4854)) {
                def_var_String_4851 = "nonusurious".substringAfter("defecator")
            } else if (def_var_String_4851.endsWith(def_var_String_4855)) {
                def_var_String_4851 = def_var_String_4854.removeSuffix(def_var_String_4852)
            } else if (def_var_String_4852.endsWith(def_var_String_4852)) {
                def_var_String_4851 = "immatereality".substringAfterLast("athetized")
            } else if (def_var_String_4856.equals(def_var_String_4854)) {
                def_var_String_4851 = def_var_String_4856.substringBeforeLast("ferter")
            } else if (def_var_String_4857.startsWith(def_var_String_4856)) {
                def_var_String_4851 = "gastrohyperneuria".substringBefore("amphogenous")
            } else if (def_var_String_4855.endsWith(def_var_String_4857)) {
                def_var_String_4851 = def_var_String_4852.commonSuffixWith("wholisms")
            } else if (def_var_String_4854.endsWith(def_var_String_4852)) {
                def_var_String_4851 = "progressions".substringAfter("bejeled")
            } else if (def_var_String_4851.contains(def_var_String_4857)) {
                def_var_String_4851 = def_var_String_4855.removePrefix(def_var_String_4856)
            } else if (def_var_String_4853.contains(def_var_String_4857)) {
                def_var_String_4851 = "coalternation".substringAfterLast("forewaters")
            } else if (def_var_String_4851.startsWith(def_var_String_4857)) {
                def_var_String_4851 = def_var_String_4855.removeSurrounding(def_var_String_4857)
            } else if (def_var_String_4857.endsWith(def_var_String_4856)) {
                def_var_String_4851 = "underkeep".removeSuffix("zaptiehs")
            } else if (def_var_String_4851.endsWith(def_var_String_4854)) {
                def_var_String_4851 = def_var_String_4854.substringAfterLast(def_var_String_4851)
            } else {
                def_var_String_4851 = "ausforming".commonSuffixWith(def_var_String_4856)
            }
        }
//$ def_var_String_4851

        // todo
        if (IS_TEST) {
            var def_var_Int_4858: Int = 4
            var def_var_Int_4859: Int = 9
            var def_var_Int_4860: Int = 18
            var def_var_Int_4861: Int = 15
            var def_var_Int_4862: Int = 20
            var def_var_Int_4863: Int = 10
            var def_var_Int_4864: Int = 14
            var def_var_Int_4865: Int = 27
            var def_var_Int_4866: Int = 21
            var def_var_Int_4867: Int = 0
            if (System.currentTimeMillis().toInt() == 0) {
                def_var_Int_4867 = def_var_Int_4865 + 16
                def_var_Int_4867 = def_var_Int_4860 - 23
                def_var_Int_4867 = def_var_Int_4863 * def_var_Int_4859
                def_var_Int_4867 = 654 - 5
                def_var_Int_4867 = 69 or 20
                def_var_Int_4867 = def_var_Int_4863 % def_var_Int_4858
                def_var_Int_4867 = 168 + 2
                def_var_Int_4867 = def_var_Int_4865 xor def_var_Int_4860
                def_var_Int_4867 = def_var_Int_4864 and def_var_Int_4863
                def_var_Int_4867 = def_var_Int_4866 and 26
            }
//$ def_var_Int_4867

            return "com.animallatest.animalspapers2024"
//            return "sassy.girls.wallpaper"
        }
        return context.packageName
    }
}