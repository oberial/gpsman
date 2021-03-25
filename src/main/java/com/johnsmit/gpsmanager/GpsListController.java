package com.johnsmit.gpsmanager;

import com.johnsmit.gpsmanager.args.AreaDeviceArgs;
import com.johnsmit.gpsmanager.args.HistoryGpsArgs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.Random;

@Api(value = "/list_location", description = "Gps区域获取")
@RestController
@RequestMapping("/list_location")
public class GpsListController {
    @ApiOperation(value = "获取区域内的设备信息", produces = "application/json;charset=UTF-8")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "通过电话号码获取记录成功", response = List.class),
//            @ApiResponse(code = 400, message = "参数非法", response = HttpError.class),
//            @ApiResponse(code = 500, message = "服务器异常", response = HttpError.class)
//    })
    @PostMapping(value = "/terminal/", produces = "application/json")
//    @RequestMapping("/api")
    public ResponseEntity<String> getAreaDevice(@RequestBody AreaDeviceArgs areaDeviceArgs) {
//        LocationResult lr=new LocationResult();
//        lr.setDeviceCode(deviceNumber);
//        lr.setLatitude(101.889492);
//        lr.setLongitude(21.625881);
//        lr.setOnlineStatus(true);·
//        lr.setSpeed("123");
//        lr.setOverSpeedStatus(false);
//        lr.setReceiveDatetime(new Date());
//        Random r = new Random();//（方法一）先生成一个对象 r，
//        Integer b= r.nextInt(10);   //调用 r 对象下面的nextInt，生成0～10之间的随机数，将结果传给 b
//        System.out.println(b);//输出随机数 b
//        Integer a = (int) (Math.double()*10); //（方法二） 调用Math.random(), 生成 [0,1)之间的数， 乘以10，结果就变为[0,10), 然后进行强制类型转换，将结果传给 a
        Random r = new Random();
        int inter=r.nextInt(10000);
        double s=inter/10000.00;
        Double d = 101.88+s;
        return ResponseEntity.status(HttpStatus.OK).body(d.toString());
    }

}
