package com.lzc.dto;


import com.lzc.entity.Setmeal;
import com.lzc.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
