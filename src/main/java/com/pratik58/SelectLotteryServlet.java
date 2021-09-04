package com.pratik58;

import com.pratik58.model.LotteryType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(
        name = "selectlotteryservlet",
        urlPatterns = "/SelectLottery"
)

public class SelectLotteryServlet extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String lotteryType = req.getParameter("Type");

        LotteryService mainSystem = new LotteryService();
        LotteryType lot = LotteryType.valueOf(lotteryType);

        List lotteryResult = mainSystem.availableLottery(lot);

        req.setAttribute("lottery", lotteryResult);
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, res);
    }
}

