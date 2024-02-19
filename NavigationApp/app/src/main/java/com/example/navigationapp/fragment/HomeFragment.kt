package com.example.navigationapp.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.navigationapp.R
import com.example.navigationapp.adapter.MainRecyclerAdapter
import com.example.navigationapp.databinding.FragmentHomeBinding
import com.example.navigationapp.model.AllCategory
import com.example.navigationapp.model.CategoryItem
import java.util.ArrayList

class HomeFragment : Fragment() {
    lateinit var binding:FragmentHomeBinding
    private var categoryItemList1: MutableList<CategoryItem> = ArrayList()
     private var categoryItemList2: MutableList<CategoryItem> = ArrayList()
    private var categoryItemList3: MutableList<CategoryItem> = ArrayList()
    private var categoryItemList4: MutableList<CategoryItem> = ArrayList()
    private var categoryItemList5: MutableList<CategoryItem> = ArrayList()
    private var categoryList = mutableListOf<AllCategory>()
    private lateinit var categoryAdapter : MainRecyclerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryAdapter = MainRecyclerAdapter(requireContext(), categoryList)
        binding.mainRecycler.layoutManager = LinearLayoutManager(requireContext())
        binding.mainRecycler.adapter = categoryAdapter

        PreparData()
        categoryItemList1()
        categoryItemList2 ()
        categoryItemList3 ()
        categoryItemList4()
        categoryItemList5()
    }
    private fun PreparData() {
        categoryList.add(AllCategory(CategoryTitle = "HollyWood",  categoryItemList1))
        categoryList.add(AllCategory(CategoryTitle = "Best of Oscars", categoryItemList2))
        categoryList.add(AllCategory(CategoryTitle = "Movies Dubbed in Hindi", categoryItemList3))
        categoryList.add(AllCategory(CategoryTitle = "Category 4th", categoryItemList4))
        categoryList.add(AllCategory(CategoryTitle = "Category 5th",  categoryItemList5))
    }

    private fun categoryItemList1(){
        categoryItemList1.add(CategoryItem(1, R.drawable.g1))
        categoryItemList1.add(CategoryItem(2, R.drawable.g2))
        categoryItemList1.add(CategoryItem(3, R.drawable.g3))
        categoryItemList1.add(CategoryItem(4, R.drawable.g4))
        categoryItemList1.add(CategoryItem(5, R.drawable.g5))
        categoryItemList1.add(CategoryItem(6, R.drawable.g6))

    }
    private fun categoryItemList2 (){
        categoryItemList2.add(CategoryItem(1, R.drawable.g7))
        categoryItemList2.add(CategoryItem(2, R.drawable.g8))
        categoryItemList2.add(CategoryItem(3, R.drawable.g9))
        categoryItemList2.add(CategoryItem(4, R.drawable.g10))
        categoryItemList2.add(CategoryItem(5, R.drawable.g11))
        categoryItemList2.add(CategoryItem(6, R.drawable.g12))
    }
    private fun categoryItemList3 (){
        categoryItemList3.add(CategoryItem(1, R.drawable.g13))
        categoryItemList3.add(CategoryItem(2, R.drawable.g14))
        categoryItemList3.add(CategoryItem(3, R.drawable.g15))
        categoryItemList3.add(CategoryItem(4, R.drawable.g16))
        categoryItemList3.add(CategoryItem(5, R.drawable.g17))
        categoryItemList3.add(CategoryItem(6, R.drawable.g18))
    }
    private fun categoryItemList4(){
        categoryItemList4.add(CategoryItem(1, R.drawable.g1))
        categoryItemList4.add(CategoryItem(2, R.drawable.g2))
        categoryItemList4.add(CategoryItem(3, R.drawable.g3))
        categoryItemList4.add(CategoryItem(4, R.drawable.g4))
        categoryItemList4.add(CategoryItem(5, R.drawable.g5))
        categoryItemList4.add(CategoryItem(6, R.drawable.g6))
    }
    private fun categoryItemList5() {
        categoryItemList5.add(CategoryItem(1, R.drawable.g7))
        categoryItemList5.add(CategoryItem(2, R.drawable.g8))
        categoryItemList5.add(CategoryItem(3, R.drawable.g9))
        categoryItemList5.add(CategoryItem(4, R.drawable.g10))
        categoryItemList5.add(CategoryItem(5, R.drawable.g11))
        categoryItemList5.add(CategoryItem(6, R.drawable.g12))
    }

}
