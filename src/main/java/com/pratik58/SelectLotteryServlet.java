package com.pratik58;

import com.pratik58.model.LotteryType;
import com.pratik58.model.TicketType;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class SelectLotteryServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String lotteryType = req.getParameter("Type");
        String ticketType = req.getParameter("Ticket");

        LotteryService mainSystem = new LotteryService();
        LotteryType lot = LotteryType.valueOf(lotteryType);
        TicketType tic = TicketType.valueOf(ticketType);

        List lotteryResult = mainSystem.availableLottery(lot, tic);

        req.setAttribute("lottery", lotteryResult);
        RequestDispatcher view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);
    }
}

