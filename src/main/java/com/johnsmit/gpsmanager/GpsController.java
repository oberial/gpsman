package com.johnsmit.gpsmanager;

import com.johnsmit.gpsmanager.args.HistoryGpsArgs;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

@Api(value = "/location", description = "GPS定位")
@RestController
@RequestMapping("/location")
public class GpsController {


    @ApiOperation(value = "获取设备GPS实时位置", produces = "application/json;charset=UTF-8")
//    @ApiResponses({
//            @ApiResponse(code = 200, message = "通过电话号码获取记录成功", response = List.class),
//            @ApiResponse(code = 400, message = "参数非法", response = HttpError.class),
//            @ApiResponse(code = 500, message = "服务器异常", response = HttpError.class)
//    })
    @GetMapping(value = "/terminal/deviceId/{deviceNumber}", produces = "application/json")
//    @RequestMapping("/api")
    public ResponseEntity<LocationResult> getLocate(@PathVariable String deviceNumber) {
        LocationResult lr=new LocationResult();
        lr.setDeviceCode(deviceNumber);

        lr.setLatitude(Double.toString(21.625881));
        lr.setLongitude(Double.toString(101.889492));
        lr.setOnlineStatus(true);
        lr.setSpeed("123");
        lr.setOverSpeedStatus(false);
        lr.setReceiveDatetime(new Date());
        return ResponseEntity.status(HttpStatus.OK).body(lr);
    }

    @ApiOperation(value = "获取设备GPS历史轨迹", produces = "application/json;charset=UTF-8")
    @PostMapping(value = "/terminal/", produces = "application/json")
//    @RequestMapping("/api")
    public ResponseEntity<ArrayList<LocationResult>> getHistroyTrace(@RequestBody HistoryGpsArgs gpsargs) {
        LocationResult lr0=new LocationResult();
        double[] s1=getLonLat();
        lr0.setDeviceCode(gpsargs.getDeviceid());
        lr0.setLatitude(Double.toString(s1[1]));
        lr0.setLongitude(Double.toString(s1[0]));
        lr0.setOnlineStatus(true);
        lr0.setSpeed("123");
        lr0.setOverSpeedStatus(false);
        lr0.setReceiveDatetime(new Date());

        LocationResult lr1=new LocationResult();
        lr1.setDeviceCode(gpsargs.getDeviceid());
        double[] s2=getLonLatLong();
        lr1.setLatitude(Double.toString(s2[1]));
        lr1.setLongitude(Double.toString(s2[0]));
        lr1.setOnlineStatus(true);
        lr1.setSpeed("123");
        lr1.setOverSpeedStatus(false);
        lr1.setReceiveDatetime(new Date());

        LocationResult lr2=new LocationResult();
        lr2.setDeviceCode(gpsargs.getDeviceid());
        double[] s3=getLonLat();
        lr2.setLatitude(Double.toString(s3[1]));
        lr2.setLongitude(Double.toString(s3[0]));
        lr2.setOnlineStatus(true);
        lr2.setSpeed("123");
        lr2.setOverSpeedStatus(false);
        lr2.setReceiveDatetime(new Date());

        ArrayList<LocationResult> sr=new ArrayList<LocationResult>();
        sr.add(lr0);
        sr.add(lr1);
        sr.add(lr2);
        return ResponseEntity.status(HttpStatus.OK).body(sr);
    }

    public double[] getLonLat()
    {
        double a[]=new double[2];
        Random r=new Random();
        int inter1=r.nextInt(10000);
        double s1=inter1/1000000.00;
        a[0] = 101.88+s1;

        int inter2=r.nextInt(10000);
        double s2=inter2/1000000.00;
        a[1]= 21.62+s2;
        return a;
    }

    public double[] getLonLatLong()
    {
        double a[]=new double[2];
        Random r=new Random();
        int inter1=r.nextInt(10000);
        double s1=inter1/1000000.00;
        a[0] = 101.81+s1;

        int inter2=r.nextInt(10000);
        double s2=inter2/1000000.00;
        a[1]= 21.61+s2;
        return a;
    }
}
