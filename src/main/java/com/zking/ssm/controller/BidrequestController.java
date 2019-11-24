package com.zking.ssm.controller;

import com.zking.ssm.model.Bidrequest;
import com.zking.ssm.service.IBidrequestService;
import com.zking.ssm.util.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/bidrequest")
public class BidrequestController extends BaseController{
    @Autowired
    private IBidrequestService bidrequestService;
    @CrossOrigin
    @RequestMapping("addBidrequest")
    public Map<String,Object> addBidrequest(Bidrequest bidrequest){
        try {
            /*贷款申请状态*/
            bidrequest.setBidrequeststate(1);
            /*申请时间*/
            bidrequest.setApplytime(new Date());
            /*总回报金额*/
            bidrequest.setTotalrewardamount(setTotalrewardamount(bidrequest));
            /*已投标多少钱*/
            bidrequest.setCurrentsum(0d);
            int insert = bidrequestService.insert(bidrequest);
            return json(null,true,"申请成功,请耐心等待审核。",0l);
        } catch (Exception e) {
            e.printStackTrace();
            return json(null,false,"申请失败",0l);
        }
    }

    @CrossOrigin
    @RequestMapping("queryBidrequestPager")
    public Map<String,Object> queryBidrequestPager(){
        List<Bidrequest> bidrequests = null;
        try {
            bidrequests = bidrequestService.queryBidrequestPager();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return json(bidrequests,true,"OK",0l);
    }
    @CrossOrigin
    @RequestMapping("queryAccrual")
    public String queryAccrual(Bidrequest bidrequest){
        double v = setTotalrewardamount(bidrequest);
        return setTotalrewardamount(bidrequest)+"";
    }
    private double setTotalrewardamount(Bidrequest bidrequest){
        double sum=0;
        /*年化利息*/
        double a=bidrequest.getCurrentrate()*0.01;
        /*按月分期计算利息*/
        if(bidrequest.getReturntype()==1){
            sum = bidrequest.getBidrequestamount() * (a / 12)*bidrequest.getMonthes2return();

        }
        /*按月到期计算利息*/
        if(bidrequest.getReturntype()==2){
            sum =((a / 12) * bidrequest.getMonthes2return())*bidrequest.getBidrequestamount();
        }
        return sum;
    }
}
