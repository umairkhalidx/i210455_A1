package com.umairkhalid.i210455

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class search_results_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.search_results)

        val home_btn: ImageButton =findViewById(R.id.home_btn)
        val home_txt: TextView =findViewById(R.id.home_txt)
        val search_btn: ImageButton =findViewById(R.id.search_btn)
        val search_txt: TextView =findViewById(R.id.search_txt)
        val chat_btn: ImageButton =findViewById(R.id.chat_btn)
        val chat_txt: TextView =findViewById(R.id.chat_txt)
        val profile_btn: ImageButton =findViewById(R.id.profile_btn)
        val profile_txt: TextView =findViewById(R.id.profile_txt)
        val plus_btn: ImageButton =findViewById(R.id.plus_btn)
        val back_btn_search: ImageButton =findViewById(R.id.back_btn)


        home_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, home_page_activity::class.java)
            startActivity(nextActivityIntent)
            finish()
        }

        home_txt.setOnClickListener{
            val nextActivityIntent = Intent(this, home_page_activity::class.java)
            startActivity(nextActivityIntent)
            finish()
        }

        search_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, lets_find_activity::class.java)
            startActivity(nextActivityIntent)
        }

        search_txt.setOnClickListener{
            val nextActivityIntent = Intent(this, lets_find_activity::class.java)
            startActivity(nextActivityIntent)
        }

        chat_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, chats_activity::class.java)
            startActivity(nextActivityIntent)
        }

        chat_txt.setOnClickListener{
            val nextActivityIntent = Intent(this, chats_activity::class.java)
            startActivity(nextActivityIntent)
        }

        profile_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, my_profile_activity::class.java)
            startActivity(nextActivityIntent)
        }

        profile_txt.setOnClickListener{
            val nextActivityIntent = Intent(this, my_profile_activity::class.java)
            startActivity(nextActivityIntent)
        }

        plus_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, add_new_mentor_activity::class.java)
            startActivity(nextActivityIntent)
        }

        plus_btn.setOnClickListener{
            val nextActivityIntent = Intent(this, add_new_mentor_activity::class.java)
            startActivity(nextActivityIntent)
        }

        back_btn_search.setOnClickListener{
            val nextActivityIntent = Intent(this, lets_find_activity::class.java)
            startActivity(nextActivityIntent)
        }

        // 1- AdapterView: RecyclerView
        val recyclerView : RecyclerView = findViewById(R.id.recycleview_searched_results)
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,
            false
        )


        // 2- Data Source: List of  Objects
        var adapter_data_list : ArrayList<recycler_searchresults_data> = ArrayList()

        val v1  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 1","Lead - Technology Officer","Available")
        val v2  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 2","Lead - Technology Officer"," Not Available")
        val v3  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 3","Lead - Technology Officer","Not Available")
        val v4  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 4","Lead - Technology Officer","Available")
        val v5  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 5","Lead - Technology Officer","Available")
        val v6  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 6","Lead - Technology Officer","Not Available")
        val v7  = recycler_searchresults_data(R.drawable.rectangle_blank,"Sample 7","Lead - Technology Officer","Available")

        adapter_data_list.add(v1)
        adapter_data_list.add(v2)
        adapter_data_list.add(v3)
        adapter_data_list.add(v4)
        adapter_data_list.add(v5)
        adapter_data_list.add(v6)
        adapter_data_list.add(v7)

        // 3- Adapter
        val adapter = recycler_searchresults_adapter(adapter_data_list)
        recyclerView.adapter = adapter

    }
}