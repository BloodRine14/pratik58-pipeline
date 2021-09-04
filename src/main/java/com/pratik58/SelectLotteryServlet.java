package com.pratik58;

import com.pratik58.model.LotteryType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class SelectLotteryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lotteryType = req.getParameter("Type");

        LotteryService mainSystem = new LotteryService();
        LotteryType lot = LotteryType.valueOf(lotteryType);

        List lotteryResult = mainSystem.availableLottery(lot);

        req.setAttribute("lottery", lotteryResult);
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);
    }
}

