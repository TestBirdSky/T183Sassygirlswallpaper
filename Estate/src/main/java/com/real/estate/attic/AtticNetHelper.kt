//Already processed
package com.real.estate.attic

import android.content.Context
import android.telephony.TelephonyManager
import com.real.estate.BuildConfig
import com.real.estate.DoorLog
import com.real.estate.FloorCache
import com.real.estate.mApp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import okhttp3.Call
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONArray
import org.json.JSONObject
import java.io.IOException
import java.util.ArrayList

import java.util.Collections

// init code
fun tzaritzas(def_var_Int_5549: Int): Int {
    var def_var_Int_5550: Int = def_var_Int_5549 - 20
    var def_var_Int_5551: Int = 5
    var def_var_Int_5552: Int = 31
    var def_var_Int_5553: Int = 15
    var def_var_Int_5554: Int = 10
    var def_var_Int_5555: Int = 25
    var def_var_Int_5556: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_5556 = def_var_Int_5554 or def_var_Int_5552
        def_var_Int_5556 = def_var_Int_5552 + 25
        def_var_Int_5556 = 547 and 12
        def_var_Int_5556 = 10 / 10
        def_var_Int_5556 = def_var_Int_5553 and 16
        def_var_Int_5556 = 842 or 23
        def_var_Int_5556 = def_var_Int_5553 - def_var_Int_5555
        def_var_Int_5556 = def_var_Int_5552 - 10
        def_var_Int_5556 = 75 + 16
        def_var_Int_5556 = 793 or 4
        def_var_Int_5556 = def_var_Int_5551 - def_var_Int_5555
        def_var_Int_5556 = 998 / 24
    }
    return def_var_Int_5556
}

fun medieval(def_var_Int_5557: Int): Int {
    var def_var_Int_5558: Int = def_var_Int_5557 or 6
    var def_var_Int_5559: Int = 8
    var def_var_Int_5560: Int = 1
    var def_var_Int_5561: Int = 1
    var def_var_Int_5562: Int = 11
    var def_var_Int_5563: Int = 19
    var def_var_Int_5564: Int = 13
    var def_var_Int_5565: Int = 29
    var def_var_Int_5566: Int = 14
    var def_var_Int_5567: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_5567 = def_var_Int_5560 / def_var_Int_5561
        def_var_Int_5567 = def_var_Int_5565 and 16
        def_var_Int_5567 = 363 and 22
        def_var_Int_5567 = def_var_Int_5562 / def_var_Int_5564
        def_var_Int_5567 = def_var_Int_5559 / def_var_Int_5566
        def_var_Int_5567 = 932 + 16
        def_var_Int_5567 = def_var_Int_5565 and 17
        def_var_Int_5567 = def_var_Int_5561 + 12
        def_var_Int_5567 = def_var_Int_5560 + 10
        def_var_Int_5567 = def_var_Int_5565 or 29
        def_var_Int_5567 = 92 * 16
        def_var_Int_5567 = def_var_Int_5562 + 4
        def_var_Int_5567 = 679 + 4
        def_var_Int_5567 = 149 xor 13
        def_var_Int_5567 = def_var_Int_5562 xor def_var_Int_5564
        def_var_Int_5567 = 62 % 22
        def_var_Int_5567 = def_var_Int_5564 and 11
        def_var_Int_5567 = def_var_Int_5565 / 6
    }
    return def_var_Int_5567
}

fun confabulate(def_var_Int_5568: Int): Int {
    var def_var_Long_5569: Long = def_var_Int_5568.toLong()
    var def_var_Long_5570: Long = System.currentTimeMillis()
    var def_var_Long_5571: Long = System.currentTimeMillis()
    var def_var_Long_5572: Long = System.currentTimeMillis()
    var def_var_Long_5573: Long = System.currentTimeMillis()
    var def_var_Long_5574: Long = System.currentTimeMillis()
    var def_var_Long_5575: Long = System.currentTimeMillis()
    var def_var_Long_5576: Long = System.currentTimeMillis()
    def_var_Long_5574 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_5574 <= def_var_Long_5570) {
            def_var_Long_5574 = def_var_Long_5569 - def_var_Long_5574
        } else if (def_var_Long_5572 == def_var_Long_5574) {
            def_var_Long_5574 = def_var_Long_5574 + 19
        } else if (def_var_Long_5574 == def_var_Long_5570) {
            def_var_Long_5574 = def_var_Long_5573 and def_var_Long_5574
        } else if (def_var_Long_5569 < def_var_Long_5570) {
            def_var_Long_5574 = def_var_Long_5574 + 21
        } else if (def_var_Long_5570 >= def_var_Long_5569) {
            def_var_Long_5574 = def_var_Long_5572 % 22
        } else if (1020.toLong() > def_var_Long_5570) {
            def_var_Long_5574 = 131 / 6
        } else if (def_var_Long_5571 != def_var_Long_5575) {
            def_var_Long_5574 = def_var_Long_5574 and 27
        } else if (def_var_Long_5574 <= def_var_Long_5572) {
            def_var_Long_5574 = def_var_Long_5570 * def_var_Long_5572
        } else if (869.toLong() != def_var_Long_5569) {
            def_var_Long_5574 = 416 * 23
        } else if (def_var_Long_5574 >= def_var_Long_5575) {
            def_var_Long_5574 = def_var_Long_5572 - def_var_Long_5571
        } else if (def_var_Long_5574 <= def_var_Long_5569) {
            def_var_Long_5574 = def_var_Long_5575 * def_var_Long_5573
        } else if (def_var_Long_5570 > def_var_Long_5571) {
            def_var_Long_5574 = def_var_Long_5576 * 17
        } else if (def_var_Long_5570 != def_var_Long_5571) {
            def_var_Long_5574 = def_var_Long_5573 % 27
        } else if (756.toLong() == def_var_Long_5571) {
            def_var_Long_5574 = 919 + 28
        } else if (def_var_Long_5574 >= def_var_Long_5572) {
            def_var_Long_5574 = def_var_Long_5571 % def_var_Long_5576
        } else if (def_var_Long_5574 <= def_var_Long_5575) {
            def_var_Long_5574 = def_var_Long_5571 / def_var_Long_5569
        } else {
            def_var_Long_5574 = 950.toLong() % def_var_Long_5569
        }
    }
    return def_var_Long_5574.toInt()
}

fun anchitherioid(def_var_Int_5577: Int): Int {
    var def_var_Int_5578: Int = def_var_Int_5577 + 25
    var def_var_Int_5579: Int = 29
    var def_var_Int_5580: Int = 11
    var def_var_Int_5581: Int = 10
    var def_var_Int_5582: Int = 31
    var def_var_Int_5583: Int = 16
    var def_var_Int_5584: Int = 8
    var def_var_Int_5585: Int = 2
    var def_var_Int_5586: Int = 11
    var def_var_Int_5587: Int = 2
    var def_var_Int_5588: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_5588 = def_var_Int_5584 or def_var_Int_5587
        def_var_Int_5588 = def_var_Int_5578 - def_var_Int_5579
        def_var_Int_5588 = def_var_Int_5583 - 13
        def_var_Int_5588 = def_var_Int_5578 + def_var_Int_5581
        def_var_Int_5588 = 292 - 23
        def_var_Int_5588 = 518 xor 2
        def_var_Int_5588 = def_var_Int_5583 or 4
        def_var_Int_5588 = def_var_Int_5584 - 3
        def_var_Int_5588 = def_var_Int_5580 / 26
        def_var_Int_5588 = def_var_Int_5584 - 9
        def_var_Int_5588 = def_var_Int_5583 / def_var_Int_5578
    }
    return def_var_Int_5588
}

fun armatoles(def_var_Int_5589: Int): Int {
    var def_var_Long_5590: Long = def_var_Int_5589.toLong()
    var def_var_Long_5591: Long = System.currentTimeMillis()
    var def_var_Long_5592: Long = System.currentTimeMillis()
    var def_var_Long_5593: Long = System.currentTimeMillis()
    var def_var_Long_5594: Long = System.currentTimeMillis()
    var def_var_Long_5595: Long = System.currentTimeMillis()
    def_var_Long_5594 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_5594 < def_var_Long_5590) {
            def_var_Long_5594 = def_var_Long_5594 or def_var_Long_5590
        } else if (def_var_Long_5594 == def_var_Long_5591) {
            def_var_Long_5594 = def_var_Long_5592 + def_var_Long_5593
        } else if (328.toLong() < def_var_Long_5595) {
            def_var_Long_5594 = 884 or 27
        } else if (def_var_Long_5590 >= def_var_Long_5595) {
            def_var_Long_5594 = def_var_Long_5590 and 31
        } else if (def_var_Long_5594 == def_var_Long_5593) {
            def_var_Long_5594 = def_var_Long_5591 xor def_var_Long_5592
        } else if (def_var_Long_5594 != def_var_Long_5595) {
            def_var_Long_5594 = def_var_Long_5593 or def_var_Long_5590
        } else if (def_var_Long_5594 >= def_var_Long_5591) {
            def_var_Long_5594 = def_var_Long_5590 xor def_var_Long_5594
        } else if (362.toLong() <= def_var_Long_5595) {
            def_var_Long_5594 = 497 and 25
        } else if (def_var_Long_5594 <= def_var_Long_5591) {
            def_var_Long_5594 = def_var_Long_5590 * def_var_Long_5595
        } else if (def_var_Long_5594 != def_var_Long_5592) {
            def_var_Long_5594 = def_var_Long_5592 xor def_var_Long_5593
        } else if (588.toLong() == def_var_Long_5595) {
            def_var_Long_5594 = 981 and 24
        } else if (def_var_Long_5594 != def_var_Long_5591) {
            def_var_Long_5594 = def_var_Long_5591 xor def_var_Long_5593
        } else if (501.toLong() == def_var_Long_5595) {
            def_var_Long_5594 = 285 xor 27
        } else if (def_var_Long_5590 < def_var_Long_5595) {
            def_var_Long_5594 = def_var_Long_5592 and 4
        } else if (357.toLong() >= def_var_Long_5591) {
            def_var_Long_5594 = 456 + 9
        } else if (def_var_Long_5594 <= def_var_Long_5595) {
            def_var_Long_5594 = def_var_Long_5594 or def_var_Long_5595
        } else if (893.toLong() != def_var_Long_5595) {
            def_var_Long_5594 = 632 - 10
        } else if (669.toLong() > def_var_Long_5592) {
            def_var_Long_5594 = 965 / 29
        } else if (def_var_Long_5594 == def_var_Long_5592) {
            def_var_Long_5594 = def_var_Long_5590 * def_var_Long_5592
        } else {
            def_var_Long_5594 = 228.toLong() and def_var_Long_5595
        }
    }
    return def_var_Long_5594.toInt()
}

fun dittanies(def_var_Int_5596: Int): Int {
    var def_var_String_5597: String = "aquotization"
    var def_var_String_5598: String = "synonymising"
    var def_var_String_5599: String = "insecticide"
    var def_var_String_5600: String = "lordy"
    var def_var_String_5601: String = "igname"
    var def_var_String_5602: String = "land"
    var def_var_String_5603: String = "caprifole"
    var def_var_String_5604: String = "vulcanalia"
    var def_var_String_5605: String = "fatality"
    def_var_String_5601 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_5601.startsWith(def_var_String_5604)) {
            def_var_String_5601 = def_var_String_5604.substringBeforeLast(def_var_String_5600)
        } else if (def_var_String_5598.contains(def_var_String_5605)) {
            def_var_String_5601 = "cinematheques".substringAfterLast("overlard")
        } else if (def_var_String_5602.startsWith(def_var_String_5598)) {
            def_var_String_5601 = "uninflectedness".removeSuffix("nonpatriotic")
        } else if (def_var_String_5601.equals(def_var_String_5600)) {
            def_var_String_5601 = def_var_String_5605.removePrefix(def_var_String_5604)
        } else if (def_var_String_5601.startsWith(def_var_String_5604)) {
            def_var_String_5601 = def_var_String_5599.removeSurrounding(def_var_String_5604)
        } else if (def_var_String_5601.contains(def_var_String_5604)) {
            def_var_String_5601 = def_var_String_5602.removePrefix(def_var_String_5604)
        } else if (def_var_String_5602.equals(def_var_String_5598)) {
            def_var_String_5601 = def_var_String_5598.substringAfter("snakebite")
        } else if (def_var_String_5603.contains(def_var_String_5597)) {
            def_var_String_5601 = def_var_String_5602.removeSurrounding("azotising")
        } else if (def_var_String_5601.equals(def_var_String_5600)) {
            def_var_String_5601 = def_var_String_5604.commonPrefixWith(def_var_String_5602)
        } else if (def_var_String_5601.contains(def_var_String_5604)) {
            def_var_String_5601 = def_var_String_5597.substringAfterLast(def_var_String_5605)
        } else if (def_var_String_5600.endsWith(def_var_String_5605)) {
            def_var_String_5601 = "isogonal".substringBeforeLast("bhungini")
        } else if (def_var_String_5601.endsWith(def_var_String_5602)) {
            def_var_String_5601 = def_var_String_5602.removeSuffix(def_var_String_5603)
        } else if (def_var_String_5600.equals(def_var_String_5604)) {
            def_var_String_5601 = "interlain".removeSurrounding("tachisms")
        } else if (def_var_String_5604.contains(def_var_String_5600)) {
            def_var_String_5601 = def_var_String_5597.substringBefore("ipecacs")
        } else if (def_var_String_5605.startsWith(def_var_String_5601)) {
            def_var_String_5601 = def_var_String_5602.substringAfterLast("hydrogenide")
        } else if (def_var_String_5604.equals(def_var_String_5603)) {
            def_var_String_5601 = "intitule".commonPrefixWith("spermotheca")
        } else if (def_var_String_5603.contains(def_var_String_5598)) {
            def_var_String_5601 = def_var_String_5598.substringAfter("rezone")
        } else if (def_var_String_5601.startsWith(def_var_String_5602)) {
            def_var_String_5601 = def_var_String_5600.removePrefix(def_var_String_5597)
        } else if (def_var_String_5598.equals(def_var_String_5597)) {
            def_var_String_5601 = "merchandise".substringAfter("aerophotos")
        } else if (def_var_String_5601.startsWith(def_var_String_5605)) {
            def_var_String_5601 = def_var_String_5603.substringBefore(def_var_String_5599)
        } else {
            def_var_String_5601 = "batrachotoxin".commonSuffixWith(def_var_String_5598)
        }
    }
//$ def_var_String_5601

    if (def_var_String_5601.startsWith("wicken")) {
        return def_var_Int_5596
    }
    return -1
}

fun crossfoot(def_var_Int_5606: Int): Int {
    var def_var_Int_5607: Int = def_var_Int_5606 or 20
    var def_var_Int_5608: Int = 23
    var def_var_Int_5609: Int = 1
    var def_var_Int_5610: Int = 23
    var def_var_Int_5611: Int = 22
    var def_var_Int_5612: Int = 5
    var def_var_Int_5613: Int = 2
    var def_var_Int_5614: Int = 18
    var def_var_Int_5615: Int = 25
    var def_var_Int_5616: Int = 25
    var def_var_Int_5617: Int = 0
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_5617 = def_var_Int_5612 * 3
        def_var_Int_5617 = def_var_Int_5607 % 28
        def_var_Int_5617 = 528 or 13
        def_var_Int_5617 = 663 % 19
        def_var_Int_5617 = def_var_Int_5608 / def_var_Int_5607
        def_var_Int_5617 = def_var_Int_5612 % def_var_Int_5608
        def_var_Int_5617 = def_var_Int_5607 and def_var_Int_5613
        def_var_Int_5617 = def_var_Int_5613 / 25
        def_var_Int_5617 = def_var_Int_5610 and def_var_Int_5607
        def_var_Int_5617 = 780 % 28
        def_var_Int_5617 = 254 or 7
        def_var_Int_5617 = 611 / 7
        def_var_Int_5617 = def_var_Int_5615 and def_var_Int_5616
        def_var_Int_5617 = def_var_Int_5608 - 21
        def_var_Int_5617 = 858 / 3
        def_var_Int_5617 = def_var_Int_5608 / 4
        def_var_Int_5617 = def_var_Int_5614 or 27
    }
    return def_var_Int_5617
}

fun dephlegmated(def_var_Int_5618: Int): Int {
    var def_var_Long_5619: Long = def_var_Int_5618.toLong()
    var def_var_Long_5620: Long = System.currentTimeMillis()
    var def_var_Long_5621: Long = System.currentTimeMillis()
    var def_var_Long_5622: Long = System.currentTimeMillis()
    var def_var_Long_5623: Long = System.currentTimeMillis()
    var def_var_Long_5624: Long = System.currentTimeMillis()
    def_var_Long_5621 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_5621 > def_var_Long_5623) {
            def_var_Long_5621 = def_var_Long_5624 + def_var_Long_5619
        } else if (def_var_Long_5622 != def_var_Long_5620) {
            def_var_Long_5621 = def_var_Long_5624 - 30
        } else if (602.toLong() == def_var_Long_5619) {
            def_var_Long_5621 = 664 and 21
        } else if (1022.toLong() >= def_var_Long_5619) {
            def_var_Long_5621 = 457 - 31
        } else if (778.toLong() < def_var_Long_5619) {
            def_var_Long_5621 = 594 and 7
        } else if (def_var_Long_5621 >= def_var_Long_5622) {
            def_var_Long_5621 = def_var_Long_5622 * def_var_Long_5621
        } else if (def_var_Long_5619 < def_var_Long_5621) {
            def_var_Long_5621 = def_var_Long_5623 - 4
        } else if (def_var_Long_5621 != def_var_Long_5623) {
            def_var_Long_5621 = def_var_Long_5624 - 23
        } else if (806.toLong() == def_var_Long_5623) {
            def_var_Long_5621 = 787 / 19
        } else if (def_var_Long_5622 > def_var_Long_5624) {
            def_var_Long_5621 = def_var_Long_5624 * 19
        } else if (383.toLong() == def_var_Long_5620) {
            def_var_Long_5621 = 678 / 17
        } else if (730.toLong() == def_var_Long_5624) {
            def_var_Long_5621 = 440 or 17
        } else {
            def_var_Long_5621 = 60.toLong() and def_var_Long_5620
        }
    }
    return def_var_Long_5621.toInt()
}

fun mintaka(def_var_Int_5625: Int): Int {
    var def_var_Long_5626: Long = def_var_Int_5625.toLong()
    var def_var_Long_5627: Long = System.currentTimeMillis()
    var def_var_Long_5628: Long = System.currentTimeMillis()
    var def_var_Long_5629: Long = System.currentTimeMillis()
    var def_var_Long_5630: Long = System.currentTimeMillis()
    var def_var_Long_5631: Long = System.currentTimeMillis()
    var def_var_Long_5632: Long = System.currentTimeMillis()
    var def_var_Long_5633: Long = System.currentTimeMillis()
    var def_var_Long_5634: Long = System.currentTimeMillis()
    var def_var_Long_5635: Long = System.currentTimeMillis()
    def_var_Long_5627 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_5627 > def_var_Long_5632) {
            def_var_Long_5627 = def_var_Long_5635 * def_var_Long_5628
        } else if (1006.toLong() <= def_var_Long_5633) {
            def_var_Long_5627 = 864 * 8
        } else if (def_var_Long_5634 < def_var_Long_5627) {
            def_var_Long_5627 = def_var_Long_5635 or 24
        } else if (def_var_Long_5632 > def_var_Long_5633) {
            def_var_Long_5627 = def_var_Long_5634 and 8
        } else if (def_var_Long_5627 == def_var_Long_5633) {
            def_var_Long_5627 = def_var_Long_5632 - def_var_Long_5634
        } else if (482.toLong() >= def_var_Long_5633) {
            def_var_Long_5627 = 967 or 29
        } else if (def_var_Long_5627 >= def_var_Long_5630) {
            def_var_Long_5627 = def_var_Long_5634 * def_var_Long_5635
        } else if (def_var_Long_5627 != def_var_Long_5628) {
            def_var_Long_5627 = def_var_Long_5632 / def_var_Long_5627
        } else if (def_var_Long_5632 < def_var_Long_5628) {
            def_var_Long_5627 = def_var_Long_5626 + 23
        } else if (def_var_Long_5627 == def_var_Long_5634) {
            def_var_Long_5627 = def_var_Long_5634 + def_var_Long_5635
        } else if (def_var_Long_5627 == def_var_Long_5635) {
            def_var_Long_5627 = def_var_Long_5632 * def_var_Long_5631
        } else if (def_var_Long_5627 >= def_var_Long_5631) {
            def_var_Long_5627 = def_var_Long_5634 % def_var_Long_5632
        } else if (8.toLong() == def_var_Long_5630) {
            def_var_Long_5627 = 498 + 29
        } else if (def_var_Long_5627 < def_var_Long_5632) {
            def_var_Long_5627 = def_var_Long_5629 + def_var_Long_5630
        } else if (def_var_Long_5627 != def_var_Long_5629) {
            def_var_Long_5627 = def_var_Long_5631 - def_var_Long_5629
        } else if (def_var_Long_5627 != def_var_Long_5629) {
            def_var_Long_5627 = def_var_Long_5627 xor def_var_Long_5628
        } else if (720.toLong() <= def_var_Long_5633) {
            def_var_Long_5627 = 30 and 4
        } else if (def_var_Long_5627 > def_var_Long_5628) {
            def_var_Long_5627 = def_var_Long_5633 / 10
        } else {
            def_var_Long_5627 = 980.toLong() % def_var_Long_5632
        }
    }
    return def_var_Long_5627.toInt()
}

fun heteronomy(def_var_Int_5636: Int): Int {
    var def_var_Long_5637: Long = def_var_Int_5636.toLong()
    var def_var_Long_5638: Long = System.currentTimeMillis()
    var def_var_Long_5639: Long = System.currentTimeMillis()
    var def_var_Long_5640: Long = System.currentTimeMillis()
    var def_var_Long_5641: Long = System.currentTimeMillis()
    var def_var_Long_5642: Long = System.currentTimeMillis()
    var def_var_Long_5643: Long = System.currentTimeMillis()
    var def_var_Long_5644: Long = System.currentTimeMillis()
    var def_var_Long_5645: Long = System.currentTimeMillis()
    var def_var_Long_5646: Long = System.currentTimeMillis()
    def_var_Long_5645 = System.currentTimeMillis()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_Long_5645 <= def_var_Long_5639) {
            def_var_Long_5645 = def_var_Long_5646 xor def_var_Long_5644
        } else if (def_var_Long_5644 != def_var_Long_5638) {
            def_var_Long_5645 = def_var_Long_5643 or 5
        } else if (def_var_Long_5638 > def_var_Long_5641) {
            def_var_Long_5645 = def_var_Long_5638 % 11
        } else if (def_var_Long_5638 <= def_var_Long_5644) {
            def_var_Long_5645 = def_var_Long_5643 % 13
        } else if (def_var_Long_5645 <= def_var_Long_5637) {
            def_var_Long_5645 = def_var_Long_5638 * def_var_Long_5644
        } else if (def_var_Long_5646 == def_var_Long_5637) {
            def_var_Long_5645 = def_var_Long_5643 xor 29
        } else if (23.toLong() > def_var_Long_5640) {
            def_var_Long_5645 = 261 / 8
        } else if (def_var_Long_5645 < def_var_Long_5646) {
            def_var_Long_5645 = def_var_Long_5645 / def_var_Long_5644
        } else if (def_var_Long_5646 >= def_var_Long_5643) {
            def_var_Long_5645 = def_var_Long_5641 / 1
        } else if (290.toLong() <= def_var_Long_5643) {
            def_var_Long_5645 = 72 or 31
        } else if (278.toLong() > def_var_Long_5637) {
            def_var_Long_5645 = 58 / 24
        } else if (902.toLong() >= def_var_Long_5642) {
            def_var_Long_5645 = 722 * 28
        } else if (379.toLong() != def_var_Long_5642) {
            def_var_Long_5645 = 259 * 3
        } else if (695.toLong() > def_var_Long_5643) {
            def_var_Long_5645 = 941 xor 10
        } else if (921.toLong() <= def_var_Long_5637) {
            def_var_Long_5645 = 673 - 16
        } else {
            def_var_Long_5645 = 26.toLong() and def_var_Long_5643
        }
    }
    return def_var_Long_5645.toInt()
}

fun glossalgy(def_var_Int_5647: Int): Int {
    var def_var_String_5648: String = "unamenability"
    var def_var_String_5649: String = "buffalofishes"
    var def_var_String_5650: String = "nonpromulgation"
    var def_var_String_5651: String = "bhikhari"
    var def_var_String_5652: String = "unlettable"
    var def_var_String_5653: String = "vinewise"
    var def_var_String_5654: String = "allied"
    def_var_String_5652 = Math.random().toString()
    if (System.currentTimeMillis().toInt() == 0) {
        if (def_var_String_5652.endsWith(def_var_String_5649)) {
            def_var_String_5652 = def_var_String_5652.removePrefix(def_var_String_5648)
        } else if (def_var_String_5653.contains(def_var_String_5654)) {
            def_var_String_5652 = "lipopexia".substringBeforeLast("infernality")
        } else if (def_var_String_5650.equals(def_var_String_5651)) {
            def_var_String_5652 = def_var_String_5653.removeSuffix("exergual")
        } else if (def_var_String_5650.endsWith(def_var_String_5648)) {
            def_var_String_5652 = "consubstantiation".removeSuffix("septicide")
        } else if (def_var_String_5653.startsWith(def_var_String_5653)) {
            def_var_String_5652 = "boblet".removeSurrounding("airlock")
        } else if (def_var_String_5648.startsWith(def_var_String_5649)) {
            def_var_String_5652 = def_var_String_5653.commonSuffixWith("grudgefulness")
        } else if (def_var_String_5653.equals(def_var_String_5651)) {
            def_var_String_5652 = def_var_String_5653.commonPrefixWith("turmut")
        } else if (def_var_String_5648.startsWith(def_var_String_5653)) {
            def_var_String_5652 = "alleviating".substringBefore("pilewort")
        } else if (def_var_String_5653.contains(def_var_String_5652)) {
            def_var_String_5652 = def_var_String_5648.removeSuffix("unseraphic")
        } else if (def_var_String_5652.contains(def_var_String_5651)) {
            def_var_String_5652 = def_var_String_5650.commonPrefixWith(def_var_String_5651)
        } else if (def_var_String_5651.startsWith(def_var_String_5653)) {
            def_var_String_5652 = "lampyrids".removeSurrounding("stoppable")
        } else if (def_var_String_5652.contains(def_var_String_5650)) {
            def_var_String_5652 = def_var_String_5652.commonSuffixWith(def_var_String_5650)
        } else if (def_var_String_5652.equals(def_var_String_5651)) {
            def_var_String_5652 = def_var_String_5653.commonPrefixWith(def_var_String_5650)
        } else {
            def_var_String_5652 = "hypertetrahedron".substringAfter(def_var_String_5650)
        }
    }
//$ def_var_String_5652

    if (def_var_String_5652.endsWith("myzodendron")) {
        return def_var_Int_5647
    }
    return -1
}

fun hourglass(def_var_Int_5655: Int): Int {//Function call
    var def_var_Int_5656: Int = 934
    if (System.currentTimeMillis().toInt() == 0) {
        def_var_Int_5656 = confabulate(523)
        def_var_Int_5656 = dephlegmated(def_var_Int_5655)
        def_var_Int_5656 = dephlegmated(400) % tzaritzas(def_var_Int_5656)
        def_var_Int_5656 = dittanies(693) - crossfoot(def_var_Int_5656)
        def_var_Int_5656 = mintaka(994) and confabulate(def_var_Int_5655)
        def_var_Int_5656 = heteronomy(738) or dittanies(def_var_Int_5656)
        def_var_Int_5656 = dittanies(911) % mintaka(def_var_Int_5656)
        def_var_Int_5656 = medieval(def_var_Int_5655)
        def_var_Int_5656 = anchitherioid(859)
        def_var_Int_5656 = tzaritzas(489)
        def_var_Int_5656 = armatoles(845) or armatoles(def_var_Int_5655)
        def_var_Int_5656 = crossfoot(def_var_Int_5655)
        def_var_Int_5656 = confabulate(164) % dittanies(def_var_Int_5656)
        def_var_Int_5656 = glossalgy(827)
        def_var_Int_5656 = confabulate(def_var_Int_5656)
        def_var_Int_5656 = mintaka(666)
        def_var_Int_5656 = tzaritzas(1012) * mintaka(def_var_Int_5655)
        def_var_Int_5656 = tzaritzas(103)
    }
    return def_var_Int_5656
}

fun canonici(def_var_Int_5657: Int): Int {//Function call(fork)
    var def_var_Int_5658: Int = 938
    if (System.currentTimeMillis().toInt() == 0) {
        if (medieval(def_var_Int_5658) >= 220) {
        } else if (anchitherioid(def_var_Int_5658) <= confabulate(490)) {
            def_var_Int_5658 = heteronomy(def_var_Int_5658)
        } else if (dephlegmated(def_var_Int_5658) < medieval(520)) {
            def_var_Int_5658 = armatoles(def_var_Int_5658)
        } else if (heteronomy(def_var_Int_5658) < 249) {
            def_var_Int_5658 = dephlegmated(636)
        } else if (heteronomy(def_var_Int_5658) >= tzaritzas(168)) {
            def_var_Int_5658 = hourglass(def_var_Int_5658)
        } else if (medieval(def_var_Int_5658) >= heteronomy(857)) {
            def_var_Int_5658 = glossalgy(def_var_Int_5658)
            def_var_Int_5658 = heteronomy(def_var_Int_5658) and armatoles(def_var_Int_5658)
        } else if (crossfoot(def_var_Int_5658) == glossalgy(566)) {
            def_var_Int_5658 = heteronomy(def_var_Int_5658)
        } else if (tzaritzas(def_var_Int_5658) <= hourglass(437)) {
            def_var_Int_5658 = dittanies(def_var_Int_5658)
        } else if (glossalgy(def_var_Int_5658) > dephlegmated(137)) {
            def_var_Int_5658 = mintaka(def_var_Int_5658)
        } else if (medieval(def_var_Int_5658) <= crossfoot(778)) {
            def_var_Int_5658 = dittanies(def_var_Int_5658)
        } else {
            def_var_Int_5658 = tzaritzas(def_var_Int_5658)
        }
    }
    return def_var_Int_5658
}

var def_var_Boolean_5659: Boolean = true
fun getlimited(): Boolean {
    return def_var_Boolean_5659
}

fun settreillage(def_var_Boolean_5660: Boolean) {
    def_var_Boolean_5659 = def_var_Boolean_5660
}

var def_var_Int_5664: Int = 1015
fun getpreferability(): Int {
    return def_var_Int_5664
}

fun setchevachee(def_var_Int_5665: Int) {
    def_var_Int_5664 = def_var_Int_5665
}

var def_var_Long_5666: Long = 465
fun getundervaluement(): Long {
    return def_var_Long_5666
}

fun setaffirms(def_var_Long_5667: Long) {
    def_var_Long_5666 = def_var_Long_5667
}

var def_var_Double_5669: Double = 233.0
fun getconusance(): Double {
    return def_var_Double_5669
}

fun setcribbages(def_var_Double_5670: Double) {
    def_var_Double_5669 = def_var_Double_5670
}

var def_var_String_5671: String = "gangster"
fun getarpeggiated(): String {
    return def_var_String_5671
}

fun setfrizing(def_var_String_5672: String) {
    def_var_String_5671 = def_var_String_5672
}


/**
 * Date：2024/4/2
 * Describe:
 */
object AtticNetHelper {
    private val ATTIC_U =
        if (BuildConfig.DEBUG) "https://test-energy.sassygirlswallpaper.com/monaco/seminary"
        else "https://energy.sassygirlswallpaper.com/homo/mid/sponge"
    private val mOkHttpClient by lazy { OkHttpClient() }
    private val atticJsonArray = Collections.synchronizedList(arrayListOf<JSONObject>())

    //operator
    val otAttic: String get() = (mApp.getSystemService(Context.TELEPHONY_SERVICE) as TelephonyManager).networkOperator

    fun postAtticI(jsonObject: JSONObject) {
        val j = FloorCache.getCommonJson()
        j.apply {
            put("gavin", "lorenz")
            val jsk = jsonObject.keys()
            while (jsk.hasNext()) {
                val jb = jsk.next()
                put(jb, jsonObject.get(jb))
            }
        }
        requestPos(j.toPostRequestBody(), retryN = 12, true)
    }

    fun postAtticAdEvent(jsonObject: JSONObject) {
        var def_var_Long_5684: Long = System.currentTimeMillis()
        var def_var_Long_5685: Long = def_var_Long_5684 + 15
        var def_var_Long_5686: Long = def_var_Long_5685 + 12
        var def_var_Long_5687: Long = def_var_Long_5686 and 24
        var def_var_Long_5688: Long = def_var_Long_5684 - 22
        var def_var_Long_5689: Long = def_var_Long_5685 % 16
        def_var_Long_5684 = System.currentTimeMillis()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_Long_5684 >= def_var_Long_5688) {
                def_var_Long_5684 = def_var_Long_5688 * def_var_Long_5687
            } else if (def_var_Long_5686 >= def_var_Long_5684) {
                def_var_Long_5684 = def_var_Long_5684 % 18
            } else if (def_var_Long_5684 <= def_var_Long_5686) {
                def_var_Long_5684 = def_var_Long_5684 and def_var_Long_5686
            } else if (849.toLong() >= def_var_Long_5688) {
                def_var_Long_5684 = 2 / 16
            } else if (535.toLong() <= def_var_Long_5687) {
                def_var_Long_5684 = 962 % 11
            } else if (412.toLong() != def_var_Long_5686) {
                def_var_Long_5684 = 602 / 1
            } else if (def_var_Long_5684 <= def_var_Long_5689) {
                def_var_Long_5684 = def_var_Long_5684 or def_var_Long_5688
            } else if (def_var_Long_5684 == def_var_Long_5685) {
                def_var_Long_5684 = def_var_Long_5684 + 23
            } else if (def_var_Long_5687 < def_var_Long_5686) {
                def_var_Long_5684 = def_var_Long_5684 + 17
            } else if (694.toLong() >= def_var_Long_5686) {
                def_var_Long_5684 = 213 xor 5
            } else if (def_var_Long_5684 != def_var_Long_5687) {
                def_var_Long_5684 = def_var_Long_5685 / def_var_Long_5684
            } else if (def_var_Long_5684 == def_var_Long_5686) {
                def_var_Long_5684 = def_var_Long_5685 xor def_var_Long_5688
            } else if (def_var_Long_5689 >= def_var_Long_5687) {
                def_var_Long_5684 = def_var_Long_5686 and 20
            } else if (def_var_Long_5687 >= def_var_Long_5686) {
                def_var_Long_5684 = def_var_Long_5687 xor 25
            } else if (def_var_Long_5684 <= def_var_Long_5685) {
                def_var_Long_5684 = def_var_Long_5686 + def_var_Long_5684
            } else {
                def_var_Long_5684 = 23.toLong() + def_var_Long_5685
            }
        }
//$ def_var_Long_5684.toInt()

        val j = FloorCache.getCommonJson()
        j.apply {
            var def_var_String_5690: String = ""
            var def_var_Double_5691: Double = Math.random()
            if ((654.0 - getconusance()) > 0.0) {
                setcribbages(getconusance() + def_var_Double_5691)
                if ((199.0 - def_var_Double_5691) > 0.0) {
                    settreillage(Math.random() > 0.5)
                    def_var_String_5690 = Math.random().toString()
                } else {
                    settreillage(Math.random() > 0.5)
                    def_var_String_5690 = Math.random().toString()
                }
            } else if ((getundervaluement() - 432) > 0) {
                def_var_Double_5691 = Math.random()
                if ((532.0 - def_var_Double_5691) > 0.0) {
                    def_var_Double_5691 = 6.toDouble()
                } else if ((705.0 - def_var_Double_5691) > 0.0) {
                    def_var_Double_5691 = 32.toDouble()
                } else if ((681.0 - def_var_Double_5691) > 0.0) {
                    def_var_Double_5691 = 153.toDouble()
                } else {
                    def_var_Double_5691 = 791.toDouble()
                }
                setcribbages(def_var_Double_5691)
                def_var_String_5690 = Math.random().toString()
            }
            setfrizing(def_var_String_5690)

            put("makeup", jsonObject)
        }
        requestPos(j.toPostRequestBody(), retryN = 3, false)
    }

    private fun requestPos(request: Request, retryN: Int, isInstall: Boolean = false) {
        var def_var_String_5692: String = "unglimpsed"
        var def_var_String_5693: String = "cookers"
        var def_var_String_5694: String = "azotometer"
        var def_var_String_5695: String = "umbraid"
        var def_var_String_5696: String = "foreknowableness"
        var def_var_String_5697: String = "villoid"
        var def_var_String_5698: String = "beshivers"
        var def_var_String_5699: String = "trisulphone"
        def_var_String_5697 = Math.random().toString()
        if (System.currentTimeMillis().toInt() == 0) {
            if (def_var_String_5697.contains(def_var_String_5698)) {
                def_var_String_5697 = def_var_String_5696.commonPrefixWith(def_var_String_5697)
            } else if (def_var_String_5697.startsWith(def_var_String_5692)) {
                def_var_String_5697 = def_var_String_5699.substringAfterLast(def_var_String_5694)
            } else if (def_var_String_5697.equals(def_var_String_5699)) {
                def_var_String_5697 = def_var_String_5693.removePrefix(def_var_String_5696)
            } else if (def_var_String_5692.contains(def_var_String_5699)) {
                def_var_String_5697 = def_var_String_5698.commonPrefixWith("slavering")
            } else if (def_var_String_5696.contains(def_var_String_5698)) {
                def_var_String_5697 = def_var_String_5697.removeSuffix("airlift")
            } else if (def_var_String_5696.contains(def_var_String_5694)) {
                def_var_String_5697 = "promulges".removePrefix("hovering")
            } else if (def_var_String_5697.contains(def_var_String_5698)) {
                def_var_String_5697 = def_var_String_5698.removeSurrounding(def_var_String_5699)
            } else if (def_var_String_5693.contains(def_var_String_5699)) {
                def_var_String_5697 = def_var_String_5694.substringAfter("medicaid")
            } else if (def_var_String_5692.endsWith(def_var_String_5698)) {
                def_var_String_5697 = "ontogenically".substringBefore("shina")
            } else if (def_var_String_5698.startsWith(def_var_String_5694)) {
                def_var_String_5697 = "incohering".commonPrefixWith("venose")
            } else if (def_var_String_5698.startsWith(def_var_String_5695)) {
                def_var_String_5697 = "moquette".commonSuffixWith("guemal")
            } else if (def_var_String_5692.contains(def_var_String_5696)) {
                def_var_String_5697 = def_var_String_5699.commonPrefixWith("interpretableness")
            } else if (def_var_String_5697.contains(def_var_String_5693)) {
                def_var_String_5697 = def_var_String_5692.commonSuffixWith(def_var_String_5698)
            } else if (def_var_String_5698.endsWith(def_var_String_5697)) {
                def_var_String_5697 = def_var_String_5698.commonPrefixWith("papey")
            } else if (def_var_String_5697.startsWith(def_var_String_5696)) {
                def_var_String_5697 = def_var_String_5696.removePrefix(def_var_String_5692)
            } else {
                def_var_String_5697 = "skiech".commonPrefixWith(def_var_String_5698)
            }
        }
//$ def_var_String_5697

        mOkHttpClient.newCall(request).enqueue(object : BaseAtticListener(isInstall) {
            override fun onFailure(call: Call, e: IOException) {
                var def_var_String_5700: String = "evulge"
                var def_var_String_5701: String = "unsoundly"
                var def_var_String_5702: String = "hoarsely"
                var def_var_String_5703: String = "outpulled"
                var def_var_String_5704: String = "morceau"
                def_var_String_5700 = Math.random().toString()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_String_5700.equals(def_var_String_5703)) {
                        def_var_String_5700 =
                            def_var_String_5700.substringAfterLast(def_var_String_5704)
                    } else if (def_var_String_5704.contains(def_var_String_5704)) {
                        def_var_String_5700 = "rachides".substringBefore("canticles")
                    } else if (def_var_String_5700.startsWith(def_var_String_5702)) {
                        def_var_String_5700 = def_var_String_5701.removePrefix(def_var_String_5702)
                    } else if (def_var_String_5700.startsWith(def_var_String_5704)) {
                        def_var_String_5700 = def_var_String_5702.removeSuffix(def_var_String_5701)
                    } else if (def_var_String_5701.startsWith(def_var_String_5703)) {
                        def_var_String_5700 = "hunanese".substringBefore("riskless")
                    } else if (def_var_String_5702.endsWith(def_var_String_5704)) {
                        def_var_String_5700 = "coliseum".removePrefix("saluters")
                    } else if (def_var_String_5700.equals(def_var_String_5704)) {
                        def_var_String_5700 = def_var_String_5701.removePrefix(def_var_String_5700)
                    } else if (def_var_String_5700.contains(def_var_String_5704)) {
                        def_var_String_5700 = def_var_String_5700.removePrefix(def_var_String_5701)
                    } else if (def_var_String_5702.endsWith(def_var_String_5700)) {
                        def_var_String_5700 = def_var_String_5704.removeSuffix("unquestioningness")
                    } else if (def_var_String_5701.endsWith(def_var_String_5701)) {
                        def_var_String_5700 = "payed".commonSuffixWith("dextroduction")
                    } else if (def_var_String_5700.equals(def_var_String_5704)) {
                        def_var_String_5700 = def_var_String_5700.removeSuffix(def_var_String_5703)
                    } else if (def_var_String_5700.startsWith(def_var_String_5701)) {
                        def_var_String_5700 = def_var_String_5704.removeSuffix(def_var_String_5702)
                    } else if (def_var_String_5704.contains(def_var_String_5703)) {
                        def_var_String_5700 = def_var_String_5704.substringAfter("pirssonite")
                    } else if (def_var_String_5702.endsWith(def_var_String_5704)) {
                        def_var_String_5700 = "unsentimentalist".substringAfterLast("prewarmed")
                    } else if (def_var_String_5704.startsWith(def_var_String_5701)) {
                        def_var_String_5700 = def_var_String_5702.removePrefix("gateless")
                    } else if (def_var_String_5700.startsWith(def_var_String_5701)) {
                        def_var_String_5700 =
                            def_var_String_5702.commonPrefixWith(def_var_String_5701)
                    } else if (def_var_String_5704.startsWith(def_var_String_5703)) {
                        def_var_String_5700 = def_var_String_5703.removeSuffix("pseudepigraphous")
                    } else {
                        def_var_String_5700 = "semilichen".removePrefix(def_var_String_5701)
                    }
                }
//$ def_var_String_5700

                DoorLog.go("onFailure--->$e")
                if (retryN > 0) {
                    var def_var_String_5705: String = "fragmentization"
                    var def_var_String_5706: String = "tzetze"
                    var def_var_String_5707: String = "symphenomenal"
                    var def_var_String_5708: String = "dividedness"
                    var def_var_String_5709: String = "taborine"
                    def_var_String_5708 = Math.random().toString()
                    if (System.currentTimeMillis().toInt() == 0) {
                        if (def_var_String_5708.startsWith(def_var_String_5706)) {
                            def_var_String_5708 =
                                def_var_String_5709.removeSurrounding(def_var_String_5705)
                        } else if (def_var_String_5705.startsWith(def_var_String_5707)) {
                            def_var_String_5708 = "protobranchiate".removeSurrounding("gelotherapy")
                        } else if (def_var_String_5705.startsWith(def_var_String_5705)) {
                            def_var_String_5708 = "licitation".removePrefix("anthropopathic")
                        } else if (def_var_String_5708.contains(def_var_String_5709)) {
                            def_var_String_5708 =
                                def_var_String_5707.removeSurrounding(def_var_String_5706)
                        } else if (def_var_String_5706.contains(def_var_String_5707)) {
                            def_var_String_5708 = "buzzers".substringAfterLast("snazziest")
                        } else if (def_var_String_5707.contains(def_var_String_5707)) {
                            def_var_String_5708 = "sinews".substringBeforeLast("unfumed")
                        } else if (def_var_String_5706.equals(def_var_String_5707)) {
                            def_var_String_5708 = def_var_String_5705.commonPrefixWith("forgiven")
                        } else if (def_var_String_5707.contains(def_var_String_5708)) {
                            def_var_String_5708 = def_var_String_5707.substringBeforeLast("derater")
                        } else if (def_var_String_5706.endsWith(def_var_String_5705)) {
                            def_var_String_5708 =
                                def_var_String_5709.substringBefore("sarcophagize")
                        } else if (def_var_String_5707.equals(def_var_String_5706)) {
                            def_var_String_5708 = "chare".substringAfter("pseudoalveolar")
                        } else if (def_var_String_5707.endsWith(def_var_String_5705)) {
                            def_var_String_5708 = "hygienization".commonSuffixWith("stooged")
                        } else if (def_var_String_5708.equals(def_var_String_5709)) {
                            def_var_String_5708 =
                                def_var_String_5709.substringAfterLast(def_var_String_5707)
                        } else {
                            def_var_String_5708 = "neoteric".removeSuffix(def_var_String_5709)
                        }
                    }
//$ def_var_String_5708

                    CoroutineScope(Dispatchers.IO).launch {
                        var def_var_String_5710: String = ""
                        var def_var_Double_5711: Double = Math.random()
                        if ((329.0 - getconusance()) > 0.0) {
                            setcribbages(getconusance() + def_var_Double_5711)
                            if ((173.0 - def_var_Double_5711) > 0.0) {
                                settreillage(Math.random() > 0.5)
                                def_var_String_5710 = Math.random().toString()
                            } else {
                                settreillage(Math.random() > 0.5)
                                def_var_String_5710 = Math.random().toString()
                            }
                        } else if ((getundervaluement() - 105) > 0) {
                            def_var_Double_5711 = Math.random()
                            if ((214.0 - def_var_Double_5711) > 0.0) {
                                def_var_Double_5711 = 585.toDouble()
                            } else if ((637.0 - def_var_Double_5711) > 0.0) {
                                def_var_Double_5711 = 905.toDouble()
                            } else if ((783.0 - def_var_Double_5711) > 0.0) {
                                def_var_Double_5711 = 337.toDouble()
                            } else {
                                def_var_Double_5711 = 975.toDouble()
                            }
                            setcribbages(def_var_Double_5711)
                            def_var_String_5710 = Math.random().toString()
                        }
                        setfrizing(def_var_String_5710)

                        delay(14001)
                        requestPos(request, retryN, isInstall)
                    }
                }
            }
        })
    }

    // 埋点
    fun postAtticEve(jsonObject: JSONObject, retryN: Int) {
        if (retryN > 0) {
            requestPos(jsonObject.toPostRequestBody(), retryN)
        } else {
            synchronized(atticJsonArray) {
                var def_var_String_5731: String = "sclerodermi"
                var def_var_String_5732: String = "psychrophobia"
                var def_var_String_5733: String = "coral"
                var def_var_String_5734: String = "diblastula"
                var def_var_String_5735: String = "crocuta"
                var def_var_String_5736: String = "phrygium"
                def_var_String_5731 = Math.random().toString()
                if (System.currentTimeMillis().toInt() == 0) {
                    if (def_var_String_5731.startsWith(def_var_String_5736)) {
                        def_var_String_5731 =
                            def_var_String_5733.substringAfter(def_var_String_5736)
                    } else if (def_var_String_5731.contains(def_var_String_5736)) {
                        def_var_String_5731 =
                            def_var_String_5733.commonSuffixWith(def_var_String_5731)
                    } else if (def_var_String_5735.startsWith(def_var_String_5732)) {
                        def_var_String_5731 = "falcula".removePrefix("underdevelope")
                    } else if (def_var_String_5731.startsWith(def_var_String_5735)) {
                        def_var_String_5731 = def_var_String_5732.removeSurrounding("resumptions")
                    } else if (def_var_String_5734.equals(def_var_String_5735)) {
                        def_var_String_5731 = "parentheticality".substringAfter("siloed")
                    } else if (def_var_String_5734.startsWith(def_var_String_5736)) {
                        def_var_String_5731 = "vaccinationist".removeSurrounding("chromitite")
                    } else if (def_var_String_5731.startsWith(def_var_String_5735)) {
                        def_var_String_5731 =
                            def_var_String_5733.substringAfter(def_var_String_5731)
                    } else if (def_var_String_5735.startsWith(def_var_String_5736)) {
                        def_var_String_5731 = "nonfavorableness".commonSuffixWith("wagga")
                    } else if (def_var_String_5731.endsWith(def_var_String_5732)) {
                        def_var_String_5731 =
                            def_var_String_5735.substringBefore(def_var_String_5733)
                    } else if (def_var_String_5732.startsWith(def_var_String_5733)) {
                        def_var_String_5731 = def_var_String_5732.substringAfter("frolicky")
                    } else if (def_var_String_5735.startsWith(def_var_String_5736)) {
                        def_var_String_5731 = "elsewhen".substringAfterLast("pudency")
                    } else if (def_var_String_5731.startsWith(def_var_String_5734)) {
                        def_var_String_5731 =
                            def_var_String_5733.commonPrefixWith(def_var_String_5731)
                    } else if (def_var_String_5735.endsWith(def_var_String_5734)) {
                        def_var_String_5731 = "invalidcy".commonSuffixWith("diversifiability")
                    } else if (def_var_String_5731.endsWith(def_var_String_5733)) {
                        def_var_String_5731 = def_var_String_5734.removeSuffix(def_var_String_5731)
                    } else if (def_var_String_5731.endsWith(def_var_String_5733)) {
                        def_var_String_5731 =
                            def_var_String_5732.substringBefore(def_var_String_5735)
                    } else if (def_var_String_5735.contains(def_var_String_5736)) {
                        def_var_String_5731 = def_var_String_5731.substringAfterLast("abomination")
                    } else if (def_var_String_5731.equals(def_var_String_5733)) {
                        def_var_String_5731 =
                            def_var_String_5732.commonPrefixWith(def_var_String_5731)
                    } else if (def_var_String_5735.contains(def_var_String_5736)) {
                        def_var_String_5731 = "devilfish".commonPrefixWith("querulist")
                    } else if (def_var_String_5732.startsWith(def_var_String_5733)) {
                        def_var_String_5731 = "negativate".substringAfterLast("yawns")
                    } else {
                        def_var_String_5731 = "overfranchised".substringAfter(def_var_String_5735)
                    }
                }
//$ def_var_String_5731

                atticJsonArray.add(jsonObject)
                if (atticJsonArray.size > 4) {
                    val jsa = JSONArray()
                    ArrayList(atticJsonArray).forEach {
                        jsa.put(it)
                    }
                    atticJsonArray.clear()
                    requestPos(jsa.toPostRequestBody(), 8)
                }
            }
        }
    }

    private fun Any.toPostRequestBody(): Request {
        return Request.Builder().url(getUrl()).apply {
            addHeader("reek", FloorCache.floorVer)
            addHeader("been", "${System.currentTimeMillis()}")
            post(
                this@toPostRequestBody.toString().toRequestBody("application/json".toMediaType())
            )
        }.build()
    }

    private fun getUrl(): String {
        return "$ATTIC_U?sylvania=${FloorCache.mFloorGid}&woo=${FloorCache.conAndC}&gilbert=${FloorCache.mDisIdS}"
    }
}