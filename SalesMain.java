package Main;

import com.sharath.category.model.CatalogTest;
import com.sharath.category.model.Category;
import com.sharath.category.model.Sales;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesMain {
    public static void main(String[] args) {

        List<Sales> salesList = new ArrayList<>();
        Sales sl = new Sales(11L, 12L, 13L, 2000L, 14L);
        Sales al = new Sales(21L, 22L, 23L, 3000L, 24L);
        salesList.add(sl);
        salesList.add(al);

        List<Category> categoryList = new ArrayList<>();
        Category cl = new Category(1L, "sharath", Arrays.asList(new Category(2L, "bharath", null)), 1000L, 50L);
        Category dl = new Category(3L, "raghu", Arrays.asList(new Category(4L, "varun", null)), 2000L, 100L);
        categoryList.add(cl);
        categoryList.add(dl);

        List<CatalogTest> catalogTestList = new ArrayList<>();
        CatalogTest ks = new CatalogTest(sl, cl);
        CatalogTest sr = new CatalogTest(al, dl);

        catalogTestList.add(ks);
        catalogTestList.add(sr);

//        List<Long> totalsaleList = new ArrayList<Long>();
//        for(Sales sales: salesList){
//
//            // filtering data of list
//            if(sales.getAmount() <3000){
//                totalsaleList.add(sales.getAmount());    // adding price to a productPriceList
//            }
//        }
//        System.out.println(totalsaleList);   // displaying data
//    }


        double totalamount = salesList.stream()
                .collect(Collectors.summingDouble(Sales -> Sales.getAmount()));
        System.out.println(totalamount);


    }

}



